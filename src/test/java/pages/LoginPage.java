package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final SelenideElement
            heading = $(".firstHeading"),
            usernameInput = $("#wpName1"),
            passwordInput = $("#wpPassword1"),
            submitButton = $("#wpLoginAttempt"),
            userPageSpan = $("#pt-userpage span");

    @Step("Открыть страницу авторизации")
    public LoginPage openLoginPage() {
        open("/w/index.php?title=Special:UserLogin");
        return this;
    }

    @Step("Нажать на кнопку Войти")
    public LoginPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    @Step("Ввести логин")
    public LoginPage setLogin(String login){
        usernameInput.setValue(login);
        return this;
    }

    @Step("Ввести пароль")
    public LoginPage setPassword(String pass){
        passwordInput.setValue(pass);
        return this;
    }

    @Step("Проверить что авторизация прошла успешно")
    public LoginPage checkThatLoginSuccess(String login){
        userPageSpan.shouldHave(text(login));
        return this;
    }

    @Step("Открыть страницу пользователя")
    public LoginPage openUserPage(){
        userPageSpan.click();
        return this;
    }

    @Step("Проверить что страница пользователя открылась")
    public LoginPage checkThatUserPageOpened(String login) {
        heading.shouldHave(text("Здравствуйте, \u202A"+login+"\u202C!"));
        return this;
    }

}

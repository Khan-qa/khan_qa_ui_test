package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import providers.UserDataProvider;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка авторизации")
    void loginTest(){
        loginPage.openLoginPage()
                .setLogin(UserDataProvider.userName)
                .setPassword(UserDataProvider.password)
                .clickSubmitButton()
                .checkThatLoginSuccess(UserDataProvider.userName);
    }

    @Test
    @DisplayName("Проверка открытия страницы пользователя")
    void userPageTest () {
        loginPage.openLoginPage()
                .setLogin(UserDataProvider.userName)
                .setPassword(UserDataProvider.password)
                .clickSubmitButton()
                .openUserPage()
                .checkThatUserPageOpened(UserDataProvider.userName);
    }

}

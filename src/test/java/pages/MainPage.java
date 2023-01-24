package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            welcomeText = $(".main-top-left .main-top-header"),
            logo = $(".mw-wiki-logo"),
            searchInput = $("#simpleSearch #searchInput"),
            searchResult = $("li.mw-search-result"),
            articleTitle = $(".mw-page-title-main"),
            wikipediaContent = $("#n-content"),
            titleWikipediaContent = $(".mw-page-title-main"),
            openDonationPage = $("#n-sitesupport"),
            donationPageHeading = $("#appeal .mw-headline");

    private final ElementsCollection searchResultList = $$("li.mw-search-result a");

    @Step("Открытие главной страницы")
    public MainPage openMainPage() {
        open("/");
        return this;
    }


    @Step("Проверка текста на главной странице")
    public MainPage checkWelcomeText() {
        welcomeText.shouldHave(text("Добро пожаловать"));
        return this;
    }

    @Step("Проверка логотипа на главной странице")
    public MainPage checkingLogoDisplay() {
        logo.shouldHave(visible);
        return this;
    }

    @Step("Поиск статьи про {article}")
    public MainPage articleSearch(String article) {
        searchInput.setValue(article).pressEnter();
        return this;
    }

    @Step("Проверка что открылась статья про {article}")
    public MainPage checkSearchResultByArticleTitle(String article) {
        articleTitle.shouldHave(text(article));
        return this;
    }

    @Step("Проверка списка результата статей")
    public MainPage checkSearchResult(String article) {
        searchResultList.shouldBe(CollectionCondition.sizeGreaterThan(1));
        searchResult.shouldHave(text(article));
        return this;
    }

    @Step("Открыть первую найденную статью")
    public MainPage openSearchResult() {
        searchResultList.first().click();
        return this;
    }

    @Step("Перейти в Содержание")
    public MainPage openContentPage() {
        wikipediaContent.click();
        return this;
    }

    @Step("Приверить что открылась страница с содержанием")
    public MainPage checkContentPage() {
        titleWikipediaContent.shouldHave(text("Содержание"));
        return this;
    }

    @Step("Открыть страницу пожертвовать")
    public MainPage openDonationPage() {
        openDonationPage.click();
        return this;
    }

    @Step("Проверить что открылась страница с пожертвованием")
    public MainPage checkThatDonationOpened() {
        donationPageHeading.shouldHave(text("Обращение основателя Википедии Джимми Уэйлса."));
        return this;
    }

}

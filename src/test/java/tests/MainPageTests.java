package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends BaseTest {

    MainPage mainPage = new MainPage();

    private static final String ARTICLE = "Java";

    @Test
    @DisplayName("Проверка видимости элементов на главной странице")
    void mainPageVisibleTest() {
        mainPage.openMainPage()
                .checkWelcomeText()
                .checkingLogoDisplay();
    }

    @Test
    @DisplayName("Проверка поиска")
    void searchTest() {
        mainPage.openMainPage()
                .articleSearch(ARTICLE)
                .checkSearchResult(ARTICLE);
    }

    @Test
    @DisplayName("Проверка открытия найденой статьи")
    void openSearchArticleTest() {
        mainPage.openMainPage()
                .articleSearch(ARTICLE)
                .checkSearchResult(ARTICLE)
                .openSearchResult()
                .checkSearchResultByArticleTitle(ARTICLE);
    }

    @Test
    @DisplayName("Открытие и проверка страницс с содержанием")
    void qwe() {
        mainPage.openMainPage()
                .openContentPage()
                .checkContentPage();
    }

    @Test
    @DisplayName("Открытие и проверка страницы с пожертвованием")
    void openAndCheckDonationsPage() {
        mainPage.openMainPage()
                .openDonationPage()
                .checkThatDonationOpened();
    }
}

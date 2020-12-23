import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();

    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();

    }

    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        logger.info("ContactUs Page test");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openHomePage() {
        HomePage homePage = mainPage.openHomePage();
        boolean isLoaded = homePage.isImageOfPageVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openSpanishlPage() {
        SpanishPage spanishPage = mainPage.openSpanishlPage();
        boolean isLoaded = spanishPage.isImageOfPageVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openFrenchPage() {
        FrenchPage frenchPage = mainPage.openFrenchPage();
        boolean isLoaded = frenchPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openMandarinPage() {
        MandarinPage mandarinPage = mainPage.openMandarinPage();
        boolean isLoaded = mandarinPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openBlogPage() {
        BlogPage blogPage = mainPage.openBlogPage();
        assertNotNull(blogPage);
        boolean isLoaded = blogPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openFaqsPage() {
        FaqsPage faqsPage = mainPage.openFaqsPage();
        assertNotNull(faqsPage);
        boolean isLoaded = faqsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }


    @Test
    public void openBooksByLanguagePage() {
        BooksByLanguagePage booksByLanguagePage = mainPage.clickBooksByLanguagePage();
        mainPage.clickBooksByLanguagePage();
        boolean isLoaded = booksByLanguagePage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openEnglishOnlyPageInBooks() {
        mainPage.clickBooksByLanguagePage();
        EnglishOnlyPage englishOnlyPage = mainPage.clickEnglishOnlyPage();
        boolean isLoaded = englishOnlyPage.isEnglishOnlyLogoTitleVisible();
        assertTrue(isLoaded);


    }


    @Test
    public void openRussianPageInBooks() {
        mainPage.clickBooksByLanguagePage();
        RussianPage russianPage = mainPage.clickRussianPage();
        boolean isLoaded = russianPage.isRussianLogoTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openEBooksByLanguagePage() {
        EBooksByLanguage eBooksByLanguage = mainPage.clickEBooksByLanguage();
        mainPage.clickEBooksByLanguage();
        boolean isLoaded = eBooksByLanguage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openRussianPageInEBook() {
        mainPage.clickEBooksByLanguage();
        RussianEBookPage russianEBookPage = mainPage.clickRussianEBookPage();
        boolean isLoaded = russianEBookPage.isLogoTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void openEnglishOnlyPageInEBook() {
        mainPage.clickEBooksByLanguage();
        EnglishEBookPage englishEBookPage = mainPage.clickEnglishEBookPage();
        boolean isLoaded = englishEBookPage.isLogoTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openResourcesPage() {
        ;
        ResourcesPage resourcesPage = mainPage.clickResourcesPage();
        mainPage.clickResourcesPage();
        boolean isLoaded = resourcesPage.isLogoTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openVideosPage() {
        mainPage.clickResourcesPage();
        VideosPage videosPage = mainPage.clickVideosPage();
        boolean isLoaded = videosPage.isLogoTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openBlogPageInResources() {
        mainPage.clickResourcesPage();
        BlogPage blogPage = mainPage.openBlogPage();
        boolean isLoaded = blogPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void openAllLanguagesPage() {
        ;
        AllLanguagesPage allLanguagesPage = mainPage.clickAllLanguagesPage();
        mainPage.clickAllLanguagesPage();
        boolean isLoaded = allLanguagesPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openBulgarianPageInAllLanguages() {
        mainPage.clickAllLanguagesPage();
        BulgarianAllLanguagesPage bulgarianAllLanguagesPage = mainPage.clickBulgarianPage();
        boolean isLoaded = bulgarianAllLanguagesPage.isLogoTitleVisible();
        assertTrue(isLoaded);


    }


    @Test
    public void openHebrewPageInAllLanguages() {
        mainPage.clickAllLanguagesPage();
        HebrewAllLanguagesPages hebrewAllLanguagesPages = mainPage.clickHebrewPage();
        boolean isLoaded = hebrewAllLanguagesPages.isLogoTitleVisible();
        assertTrue(isLoaded);


    }
}
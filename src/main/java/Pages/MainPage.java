package Pages;

import Consts.Consts;

public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US = "//a[text()='Contact us']";
    private static final String BOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-books-by-language']";
    private static final String EBOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-ebooks-by-language']";
    private static final String ALL_LANGUAGES = "//a[@aria-controls='SiteNavLabel-all-languages']";
    private static final String RESOURCES_PAGE = "//a[@aria-controls='SiteNavLabel-resources']";
    private static final String VIDEOS_PAGE = "//*[text()='Videos']";
    private static final String ENGLISH_ONLY = "//a[text() = 'English Only']";
    private static final String RUSSIAN_PAGE = "//a[text() = 'Russian - Русский']";
    private static final String RUSSIAN_EBOOK_PAGE = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']//following-sibling::div//*[text() = 'Russian - Русский']";
    private static final String ENGLISH_EBOOK_PAGE = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']//following-sibling::div//*[text() = 'English Only']";
    private static final String BULGARIAN_ALL_LANGUAGES_PAGE = "//*[@aria-controls='SiteNavLabel-all-languages']//following-sibling::div//*[text() = 'Bulgarian-Български']";
    private static final String HEBREW_ALL_LANGUAGES_PAGE = "//*[@aria-controls='SiteNavLabel-all-languages']//following-sibling::div//*[text() = 'Hebrew - עִבְרִית']";
    private static final String HOME_TAB = "//a[text() = 'Home']";
    private static final String SPANISH_PAGE = "//a[text()='Español']";
    private static final String FRENCH_PAGE = "//a[text()='Français']";
    private static final String MANDARIN_PAGE = "//a[text()='中文']";
    private static final String BLOG_PAGE = "//a[text()='Blog' and @class = 'site-nav__link site-nav__link--main']";
    private static final String FAQS_PAGE = "//a[text()='FAQs']";



    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);

    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US);
        return new ContactUsPage();
    }


    public HomePage openHomePage() {
        clickElementByXpath(HOME_TAB);
        return new HomePage();
    }

    public SpanishPage openSpanishlPage() {
        clickElementByXpath(SPANISH_PAGE);
        return new SpanishPage();
    }

    public FrenchPage openFrenchPage() {
        clickElementByXpath(FRENCH_PAGE);
        return new FrenchPage();
    }

    public MandarinPage openMandarinPage() {
        clickElementByXpath(MANDARIN_PAGE);
        return new MandarinPage();
    }

    public BlogPage openBlogPage() {
        clickElementByXpath(BLOG_PAGE);
        return new BlogPage();
    }

    public FaqsPage openFaqsPage() {
        clickElementByXpath(FAQS_PAGE);
        return new FaqsPage();
    }

    public BooksByLanguagePage clickBooksByLanguagePage() {
        clickElementByXpath(BOOKS_BY_LANGUAGE);
        return new BooksByLanguagePage();

    }

    public EBooksByLanguage clickEBooksByLanguage(){
        clickElementByXpath(EBOOKS_BY_LANGUAGE);
        return  new EBooksByLanguage();

    }


    public EnglishOnlyPage clickEnglishOnlyPage() {
        clickElementByXpath(ENGLISH_ONLY);
        return new EnglishOnlyPage();

    }
    public RussianPage clickRussianPage() {
        clickElementByXpath(RUSSIAN_PAGE);
        return new RussianPage();


    }

    public ResourcesPage clickResourcesPage() {
        clickElementByXpath(RESOURCES_PAGE);
        return new ResourcesPage();


    }
    public VideosPage clickVideosPage() {
        clickElementByXpath(VIDEOS_PAGE);
        return new VideosPage();


    }
    public AllLanguagesPage clickAllLanguagesPage() {
        clickElementByXpath(ALL_LANGUAGES);
        return new AllLanguagesPage();

    }
    public RussianEBookPage clickRussianEBookPage() {
        clickElementByXpath(RUSSIAN_EBOOK_PAGE);
        return new RussianEBookPage();

    }
    public EnglishEBookPage clickEnglishEBookPage() {
        clickElementByXpath(ENGLISH_EBOOK_PAGE);
        return new EnglishEBookPage();

    }
    public BulgarianAllLanguagesPage clickBulgarianPage() {
        clickElementByXpath(BULGARIAN_ALL_LANGUAGES_PAGE);
        return new BulgarianAllLanguagesPage();

    }
    public HebrewAllLanguagesPages clickHebrewPage() {
        clickElementByXpath(HEBREW_ALL_LANGUAGES_PAGE);
        return new HebrewAllLanguagesPages();

    }
}
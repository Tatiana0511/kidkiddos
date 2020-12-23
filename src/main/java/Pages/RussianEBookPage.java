package Pages;

public class RussianEBookPage extends BasePage {
    private static final String RUSSIAN_EBOOK_PAGE_HEADER = "//h1[text() = 'eBooks in Russian - Русский']";

    public boolean isLogoTitleVisible() {
        return elementExists(RUSSIAN_EBOOK_PAGE_HEADER);
    }

}

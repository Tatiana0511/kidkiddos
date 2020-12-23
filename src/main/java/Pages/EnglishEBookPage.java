package Pages;

public class EnglishEBookPage extends BasePage {
    private static final String ENGLISH_EBOOK_PAGE_HEADER = "//h1[text() = 'ebooks in English Only']";

    public boolean isLogoTitleVisible() {
        return elementExists(ENGLISH_EBOOK_PAGE_HEADER);
    }

}

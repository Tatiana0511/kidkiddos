package Pages;

public class BooksByLanguagePage extends BasePage {
    public static final String BOOKS_BY_LANGUAGE_HEADER = "//h1[text() = 'Find your language']";



    public boolean isPageTitleVisible() {
        return elementExists(BOOKS_BY_LANGUAGE_HEADER);

    }


}

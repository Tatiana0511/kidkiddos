package Pages;

public class EBooksByLanguage extends BasePage {
    public static final String EBOOKS_BY_LANGUAGE_HEADER = "//h1[text() = 'ebooks']";



    public boolean isPageTitleVisible() {
        return elementExists(EBOOKS_BY_LANGUAGE_HEADER);

    }


}

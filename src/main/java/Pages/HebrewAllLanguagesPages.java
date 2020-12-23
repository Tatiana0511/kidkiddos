package Pages;

public class HebrewAllLanguagesPages extends BasePage {
    private static final String HEBREW_ALL_LANGUAGES_PAGE_HEADER = "//h1[text() = 'Hebrew - עִבְרִית']";

    public boolean isLogoTitleVisible() {
        return elementExists(HEBREW_ALL_LANGUAGES_PAGE_HEADER);
    }

}


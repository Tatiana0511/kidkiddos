package Pages;

public class BulgarianAllLanguagesPage extends BasePage {
    private static final String BULGARIAN_ALL_LANGUAGES_PAGE_HEADER = "//h1[text() = 'Bulgarian-Български']";

    public boolean isLogoTitleVisible() {
        return elementExists(BULGARIAN_ALL_LANGUAGES_PAGE_HEADER );
    }

}

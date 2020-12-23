package Pages;

public class EnglishOnlyPage extends BasePage {
    private static final String ENGLISH_ONLY_LOGO = "//h1[text() = 'English Only']";

    public boolean isEnglishOnlyLogoTitleVisible() {
        return elementExists(ENGLISH_ONLY_LOGO);

    }

}

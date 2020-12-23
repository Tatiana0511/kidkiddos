package Pages;

public class RussianPage extends BasePage {
    private static final String Russian_LOGO = "//h1[text() = 'Russian - Русский']";

    public boolean isRussianLogoTitleVisible() {
        return elementExists(Russian_LOGO);
    }

}


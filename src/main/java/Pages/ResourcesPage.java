package Pages;

public class ResourcesPage extends BasePage {

    private static final String RESOURCES_LOGO_PAGE = "//h1[text() = 'Fun and Educational Videos for Kids']";

    public boolean isLogoTitleVisible() {
        return elementExists(RESOURCES_LOGO_PAGE);

    }

}



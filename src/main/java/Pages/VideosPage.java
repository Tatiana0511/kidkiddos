package Pages;

public class VideosPage extends BasePage {
    private static final String VIDEOS_LOGO = "//h1[text() = 'Fun and Educational Videos for Kids']";

    public boolean isLogoTitleVisible() {
        return elementExists(VIDEOS_LOGO);
    }

}


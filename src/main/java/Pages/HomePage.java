package Pages;

public class HomePage extends BasePage {
    public static final String  HOME_PAGE_IMG = "//*[@class='hero__inner']";

    public boolean isImageOfPageVisible(){
        return elementExists(HOME_PAGE_IMG);


    }
}

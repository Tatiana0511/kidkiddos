package Pages;

public class FrenchPage extends BasePage{

    public static final String  FRENCH_HEADER = "//*[@class='section-header text-center']";


    public boolean isPageTitleVisible(){
        return elementExists(FRENCH_HEADER);


    }

}

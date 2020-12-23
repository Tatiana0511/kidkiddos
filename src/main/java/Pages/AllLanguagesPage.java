package Pages;

public class AllLanguagesPage extends BasePage{

    public static final String  ALL_LANGUAGE_HEADER = "//h1[text() = 'Find your language']";


    public boolean isPageTitleVisible(){
        return elementExists(ALL_LANGUAGE_HEADER);


    }
}

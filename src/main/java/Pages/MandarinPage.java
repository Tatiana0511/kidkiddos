package Pages;

public class MandarinPage extends BasePage{

    public static final String  MANDARIN_HEADER = "//h1[text() = 'Mandarin Chinese - 中文']";


    public boolean isPageTitleVisible(){
        return elementExists(MANDARIN_HEADER);


    }

}

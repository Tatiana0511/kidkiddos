package Pages;

public class FaqsPage extends BasePage{

    public static final String  FAQS_HEADER = "//*[@class='section-header text-center']";


    public boolean isPageTitleVisible(){
        return elementExists(FAQS_HEADER);


    }
}

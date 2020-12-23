package Pages;

public class SpanishPage extends BasePage{

    public static final String  SPANISH_HEADER = "//img[@alt = 'Spanish-languages-learning-bilingual-coloring-book-cover']";


    public boolean isImageOfPageVisible(){
        return elementExists(SPANISH_HEADER);


    }

}

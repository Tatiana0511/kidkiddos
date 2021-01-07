import Utils.UseCaseBase;
import Pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnglishBooksPageTest extends UseCaseBase {

    private static EnglishBooksPage englishBooksPage;
    public static final Logger logger = LogManager.getLogger(EnglishBooksPageTest.class);

    @BeforeAll
    public static void classSetUp() {
        englishBooksPage = new EnglishBooksPage();

    }

    @BeforeEach
    public void beforeTest() {
        englishBooksPage.navigateToEnglishBooksPage();

    }



    @Test
    public void setEnglishBooksPageLoadTest() {
        Boolean success = englishBooksPage.isLogoVisible();
        assertTrue(success);
    }

    @Test
    public void manyBooksAddTest() {
        englishBooksPage.clickBook();
        englishBooksPage.setQuantityField("2");
        englishBooksPage.clickAddToCartButton();
        boolean isFound = englishBooksPage.manyBooksAvailable();
        assertTrue(isFound);


    }


    @Test
    public void bookTest() {
        englishBooksPage.clickBook();
        boolean isFound = englishBooksPage.iLoveToEatHeader();
        assertTrue(isFound);


    }

    @Test
    public void addToCartTest() {
        englishBooksPage.clickBook();
        englishBooksPage.clickAddToCartButton();
        boolean isFound = englishBooksPage.bookAvailable();
        assertTrue(isFound);


    }


    @Test
    public void differentLanguagesBooksTest() {
        englishBooksPage.clickBook();
        englishBooksPage.clickAddToCartButton();
        englishBooksPage.spanishBook();
        englishBooksPage.coloringSpanishBook();
        englishBooksPage.clickAddToCartButton();
        boolean isFound = englishBooksPage.isAvailable();
        assertTrue(isFound);


    }

}

package Pages;
import Consts.Consts;

public class EnglishBooksPage extends BasePage {
    private static final String ENGLISH_BOOK_PAGE_HEADER = "//h1[text() = 'English Only']";
    private static final String I_LOVE_TO_EAT_BOOK = "//*[@alt= 'I-Love-to-Eat-Fruits-and-Vegetables-kids-bunnies-bedtime-story-Shelley-Admont-English-cover']";
    private static final String I_LOVE_TO_EAT_BOOK_HEADER = "//*[@class = 'product-featured-img']";
    private static final String ADD_TO_CART_BUTTON = "//*[@id = 'AddToCart-product-template']";
    private static final String ONE_BOOK_AVAILABLE = "//*[@value = '1']";
    private static final String MANY_BOOKS_AVAILABLE = "//*[@value = '21']";
    private static final String QUANTITY_FIELD = "//*[@type='number']";
    private static final String SPANISH_PAGE = "//a[text()='Español']";
    private static final String COLORING_SPANISH_BOOK = "//*[@alt='Spanish-languages-learning-bilingual-coloring-book-cover']";
    private static final String PROVE_AVAILABILITY = "//*[@id='CartCount' and '22']";



    public void navigateToEnglishBooksPage() {
        webDriver.get(Consts.ENGLISH_BOOKS_URL);

    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(ENGLISH_BOOK_PAGE_HEADER);
        return isVisible;
    }

    public void clickBook() {
        clickElementByXpath(I_LOVE_TO_EAT_BOOK);

    }
    public boolean iLoveToEatHeader() {
        return elementExists(I_LOVE_TO_EAT_BOOK_HEADER);

    }
    public void clickAddToCartButton() {
        clickElementByXpath(ADD_TO_CART_BUTTON);

    }

    public boolean bookAvailable() {
        return elementExists(ONE_BOOK_AVAILABLE);

    }

    public String setQuantityField (String number) {
        sendTextToElementByXpath(QUANTITY_FIELD, number);
        String actualResult = findElementByXpath(QUANTITY_FIELD).getAttribute("value");
        return actualResult;

    }

    public boolean manyBooksAvailable() {
        return elementExists(MANY_BOOKS_AVAILABLE);

    }

    public void spanishBook() {
        clickElementByXpath(SPANISH_PAGE);

    }
    public void coloringSpanishBook() {
        clickElementByXpath(COLORING_SPANISH_BOOK);

    }
    public boolean isAvailable() {
        return elementExists(PROVE_AVAILABILITY );

    }

}

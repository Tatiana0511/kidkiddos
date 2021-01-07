package Pages;

import Consts.Consts;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactUsPage extends BasePage {
    private static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    private static final String NAME_FIELD = "//*[@name='field[3]']";
    private static final String EMAIL_FIELD = "//*[@name='email']";
    private static final String YOUR_MESSAGE_FIELD = "//*[@name='field[7]']";
    private static final String SEND_MESSAGE_BUTTON = "//*[@id='_form_44_submit']";
    private static final String ERROR_MESSAGE = "//*[@class= '_error-inner']";
    private static final String LOGIN_BUTTON = "//*[@class='icon icon-login']";
    private static final String CART_BUTTON = "//*[@class='icon icon-cart']";
    private static final String CART_HEADER = "//h1[text()='Your cart']";



    public void navigateToContactUsPage() {
        webDriver.get(Consts.CONTACT_US_URL);

    }

    public boolean isPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);

    }

    public String nameFillField(String name) {
        sendTextToElementByXpath(NAME_FIELD, name);
        String actualResult = findElementByXpath(NAME_FIELD).getAttribute("value");
        return actualResult;
    }

    public String messageFillField(String message) {
        sendTextToElementByXpath(YOUR_MESSAGE_FIELD, message);
        String actualResult = findElementByXpath(YOUR_MESSAGE_FIELD).getAttribute("value");
        return actualResult;

    }

    public String emailFillField(String email) {
        sendTextToElementByXpath(EMAIL_FIELD, email);
        String actualResult = findElementByXpath(EMAIL_FIELD).getAttribute("value");
        return actualResult;


    }

    public void sendMessageButton() {
        clickElementByXpath(SEND_MESSAGE_BUTTON);

    }

    public boolean errorMessage() {
        return elementExists(ERROR_MESSAGE);

    }


    public void clickCartButton() {
        clickElementByXpath(CART_BUTTON);


    }

    public boolean isCartTitleVisible() {
        return elementExists(CART_HEADER);
        

    }




    public LoginPage openLoginPage() {
        clickElementByXpath(LOGIN_BUTTON);
        return new LoginPage();
    }

}





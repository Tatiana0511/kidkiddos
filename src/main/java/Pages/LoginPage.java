package Pages;

import Consts.Consts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage extends BasePage{
    private static final String LOGIN_HEADER = "//h1[text()='Login']";
    private static final String EMAIL = "//*[@id='CustomerEmail']";
    private static final String PASSWORD = "//*[@id='CustomerPassword']";
    private static final String FORGOT_PASSWORD = "//*[@id='RecoverPassword']";
    private static final String FORGOT_PASSWORD_PAGE_HEADER = "//*[text()='Reset your password']";
    private static final String SING_IN_BUTTON = "//*[@class='btn']";
    private static final String CREATE_ACCOUNT = "//*[@id='customer_register_link']";
    private static final String CREATE_ACCOUNT_PAGE_HEADER = "//*[text()='Create Account']";
    private static final String ERROR_FIELD = "//*[text()='Incorrect email or password.']";


    public void navigateToLoginPage() {
        webDriver.get(Consts.LOGIN_URL);

    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGIN_HEADER);
        return isVisible;
    }

    public String emailFillField(String email) {
        sendTextToElementByXpath(EMAIL, email);
        String actualResult = findElementByXpath(EMAIL).getAttribute("value");
        return actualResult;

    }

    public String passwordFillField(String password) {
        sendTextToElementByXpath(PASSWORD, password);
        String actualResult = findElementByXpath(PASSWORD).getAttribute("value");
        return actualResult;


    }
    public void singInButton() {
        clickElementByXpath(SING_IN_BUTTON);

    }

    public boolean errorField() {
        return elementExists(ERROR_FIELD);

    }
    public void clickForgotPassword() {
        clickElementByXpath(FORGOT_PASSWORD);

    }
    public boolean forgotPasswordHeaderVisibility() {
        return elementExists(FORGOT_PASSWORD_PAGE_HEADER);

    }
    public void clickCreateAccount() {
        clickElementByXpath(CREATE_ACCOUNT);

    }
    public boolean createAccountPageVisibility() {
        return elementExists(CREATE_ACCOUNT_PAGE_HEADER);

    }

}

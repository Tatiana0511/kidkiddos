import Pages.ContactUsPage;

import Pages.LoginPage;

import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class ContactUsPageTest extends UseCaseBase {
    private static ContactUsPage contactUsPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetUp() {
        contactUsPage = new ContactUsPage();

    }

    @BeforeEach
    public void beforeTest() {
        contactUsPage.navigateToContactUsPage();

    }

    @Test
    public void setContactUsPageLoadTest() {
        Boolean success = contactUsPage.isPageTitleVisible();
        assertTrue(success);
    }
    @Test
    public void messageTest() {
        String result = contactUsPage.messageFillField("Hi,world!");
        assertEquals(result,"Hi,world!");
    }

    @Test
    public void nameTest() {
        String result = contactUsPage.nameFillField("Mary");
        assertEquals(result,"Mary");
    }

    @Test
    public void emailTest() {
        String result = contactUsPage.emailFillField("itlegion@gmail.com");
        assertEquals(result,"itlegion@gmail.com");
    }

    @ParameterizedTest
    @ValueSource(strings = {"@@@@@@gmail.com", "com.gmail@!!!!!", "-1@gmail/com", "2@$%^&"})
    public void emailFieldTest(String email) {
        logger.info("Email Field Test" + email);
        String result = contactUsPage.emailFillField(email);
        assertEquals(email, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"__- /////// !", "Ma            ry", "Bob", "2@$%!!!!^&"})
    public void nameFieldTest(String name) {
        String result = contactUsPage.nameFillField(name);
        assertEquals(name, result);


    }

    @Test
    public void sendMessageButton() {
        contactUsPage.sendMessageButton();
        boolean error = contactUsPage.errorMessage();
        assertNotNull(error);


    }

    @Test
    public void emailFieldErrorTest() {
        contactUsPage.emailFillField("1111111");
        contactUsPage.sendMessageButton();
        boolean error = contactUsPage.errorMessage();
        assertNotNull(error);


        }

    @Test
    public void nameFieldErrorTest() {
        contactUsPage.nameFillField("          ");
        contactUsPage.sendMessageButton();
        boolean error = contactUsPage.errorMessage();
        assertNotNull(error);


    }


    @Test
    public void openCartPage() {
        contactUsPage.clickCartButton();
        boolean isLoaded = contactUsPage.isCartTitleVisible();
        assertTrue(isLoaded);


    }




    @Test
    public void openLoginPage() {
        LoginPage loginPage = contactUsPage.openLoginPage();
        assertNotNull(loginPage);
        boolean isLoaded = loginPage.isLogoVisible();
        assertTrue(isLoaded);


    }

}


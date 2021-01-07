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


public class LoginPageTest extends UseCaseBase {
        private static LoginPage loginPage;
        public static final Logger logger = LogManager.getLogger(LoginPageTest.class);

        @BeforeAll
        public static void classSetUp() {
            loginPage = new LoginPage();

        }

        @BeforeEach
        public void beforeTest() {
            loginPage.navigateToLoginPage();

        }

        @Test
        public void setContactUsPageLoadTest() {
            Boolean success = loginPage.isLogoVisible();
            assertTrue(success);
        }

        @Test
        public void emailTest() {
            String result = loginPage.emailFillField("taty@gmail.com");
            assertEquals(result,"taty@gmail.com");
        }
        @Test
        public void passwordTest() {
            String result = loginPage.passwordFillField("1q2w3e");
            assertEquals(result,"1q2w3e");
        }

    @Test
    public void errorFieldTest() {
        loginPage.singInButton();
        boolean error = loginPage.errorField();
        assertNotNull(error);


    }
    @Test
    public void incorrectInfoTest() {
        loginPage.emailFillField("1@gmail.com");
        loginPage.passwordFillField("1q2w3e4r");
        loginPage.singInButton();
        boolean error = loginPage.errorField();
        assertNotNull(error);


    }

    @Test
    public void forgotPasswordTest() {
        loginPage.clickForgotPassword();
        boolean isFound = loginPage.forgotPasswordHeaderVisibility();
        assertTrue(isFound);


    }

    @Test
    public void createAccountTest() {
        loginPage.clickCreateAccount();
        boolean isFound = loginPage.createAccountPageVisibility();
        assertTrue(isFound);


    }
    @ParameterizedTest
    @ValueSource(strings = {"@@@@@@gmail.com", "com.@!!!!!", "-1@gmail/com", "2@$%^&"})
    public void emailFieldTest(String email) {
        logger.info("Email Field Test" + email);
        String result = loginPage.emailFillField(email);
        assertEquals(email, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"hhh", "00000000000", "qawsedrf", "2@$%!!!!^&"})
    public void passwordFieldTest(String password) {
        String result = loginPage.passwordFillField(password);
        assertEquals(password, result);


    }


}

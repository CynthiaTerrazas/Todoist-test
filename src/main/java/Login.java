import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Cynthia on 9/4/2017.
 */
public class Login extends BasePage {


        private static final String URL = "https://en.todoist.com/";

         @FindBy(css = "a[class='sel_login']")
         private WebElement loginOption;

        @FindBy(id = "email")
        private WebElement emailInputField;

        @FindBy(id = "password")
        private WebElement passwordInputField;

        @FindBy(className = "submit_btn")
        private WebElement loginButton;


        /**
         * Constructor for Default.
         */
    public Login() {
        loadUrlPage(URL);
    }

    /**
     *
     * @param email of the user.
     * @return the fill that input field.
     */
    public Login setEmail(String email) {
        CommonActions.setInputField(emailInputField, email);
        return this;
    }

    /**
     *
     * @param password for log in.
     * @return the login page.
     */
    public Login setPassword(String password) {
        CommonActions.setInputField(passwordInputField, password);
        return this;
    }

    /**
     *
     * @return home page.
     */
    public Home clickLogin() {
        CommonActions.clickElement(loginButton);
        return new Home();
    }

    /**
     *
     * @return login page.
     */
    public Login clickLoginOption() {
        CommonActions.clickElement(loginOption);
        return this;
    }

    /**
     *
     * @param email for log in.
     * @param password for log in.
     * @return home page.
     */
    public Home loginInitial(String email, String password) {
        clickLoginOption();
        driver.switchTo().frame("GB_frame").switchTo().frame("GB_frame");
        return setEmail(email).setPassword(password).clickLogin();
    }

}

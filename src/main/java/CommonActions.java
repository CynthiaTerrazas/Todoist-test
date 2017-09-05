import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Cynthia on 9/4/2017.
 */
public final class CommonActions {

    /**
     * Constructor private.
     */
    private CommonActions() {
    }

    /**
     * This method waits and clear the WebElement.
     *
     * @param webElement WebElement to wait and clear.
     */
    public static void clearTextField(WebElement webElement) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
    }

    /**
     * This method set a Input Field.
     *
     * @param webElement WebElement to wait and fill.
     * @param text       Text to fill.
     */
    public static void setInputField(WebElement webElement, String text) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        clearTextField(webElement);
        webElement.sendKeys(text);
    }

    /**
     * This method waits and click on the webElement.
     *
     * @param webElement WebElement to wait and click.
     */
    public static void clickElement(WebElement webElement) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }


}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Cynthia on 9/4/2017.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * Constructor.
     */

    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }

    /**
     * Load page Url to web driver.
     *
     * @param url Url of web page.
     */
    public void loadUrlPage(String url) {
        driver.get(url);
    }



    public String getUrl() {
        return driver.getCurrentUrl();
    }


}








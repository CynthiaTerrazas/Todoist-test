import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Cynthia on 9/4/2017.
 */
public final class DriverManager {
    private static final String KEY = "webdriver.chrome.driver";
    private static final String PATH = "drivers/chromedriver.exe";
    private static DriverManager instance;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor.
     */
    private DriverManager() {
        System.setProperty(KEY, PATH);
        driver = new ChromeDriver();
        backPreviousWait();
    }

    /**
     * Get Instance of the Driver manager.
     *
     * @return the instance.
     */
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * Set time implicit wait.
     * @param implicitTimeWait time for wait.
     */
    public void setImplicitTimeWait(int implicitTimeWait) {
        driver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    /**
     * Set time explicit wait.
     * @param explicitTimeWait time for wait.
     */
    public void setExplicitTimeWait(int explicitTimeWait) {
        wait = new WebDriverWait(driver, explicitTimeWait);
    }


    /**
     * Back previous set default times.
     */
    public void backPreviousWait() {
        final int implicitTimeWait = 15;
        final int explicitTimeWait = 30;
        setImplicitTimeWait(implicitTimeWait);
        setExplicitTimeWait(explicitTimeWait);
    }

    /**
     * Get Driver instance.
     *
     * @return driver instance.
     */
    public WebDriver getDriver() {
        return driver;
    }



    /**
     * Gets wait instance.
     *
     * @return the wait.
     */
    public WebDriverWait getWait() {
        return wait;
    }
}


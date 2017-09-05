import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Cynthia on 9/4/2017.
 */
public class Home extends BasePage{
    @FindBy(id ="gear_holder")
    private WebElement configurationIcon;

    @FindBy(className ="cmp_setting_logout")
    private WebElement logout;

    public Home clickconFigurationIcon() {
        CommonActions.clickElement(configurationIcon);
        return this;
    }

    public Home clickLogout() {
        CommonActions.clickElement(logout);
        return this;
    }

}

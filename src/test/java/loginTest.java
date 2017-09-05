import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cynthia on 9/4/2017.
 */
public class loginTest {
    Login log;

    /**
     * before.
     */
    @Before
    public void setUp() {
        log = new Login();
    }

    /**
     * test basic login.
     */
    @Test
    public void testLoginSuccessfully() {
        String username = "cynthia.terrazas@fundacion-jala.org";
        String password = "secret";
        Home homePage = log.loginInitial(username, password);
        assertTrue(homePage.getUrl().contains("https://en.todoist.com/app"));
    }

    /**
     * test basic logout.
     */
    @Test
    public void testLogout() {
        String username = "cynthia.terrazas@fundacion-jala.org";
        String password = "secret";
        Home homePage = log.loginInitial(username, password);
        homePage.clickconFigurationIcon();
        homePage.clickLogout();
        assertTrue(homePage.getUrl().contains("https://en.todoist.com"));
    }
}

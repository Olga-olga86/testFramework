
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GitHubTest extends BaseTest {
Logger logger;
    @Test
    public void verifyThatLoginIsSuccessful() {
        Logger logger = LogManager.getLogger();
        logger.info("User is on the Main page");
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                getTextOnTheMainPage().isDisplayed());

    }

    @Test
    public void verifyThatMyRepositoryPageIsOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository();
    }

    @Test
    public void verifyThatIssuesTabIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().getHeader().isDisplayed());
    }

    @Test
    public void verifyOpeningIssueTab() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository().opensSuccessful();
    }

    @Test
    public void verifyButtonIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().opensSuccessful().getButtonOnTheIssuesPage().isDisplayed());
    }

    @Test
    public void verifyThanNewIssueButtonIsAvailable() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository().
                opensSuccessful().clickSuccessful();
    }

    @Test
    public void verifyThatTitleFieldIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().opensSuccessful().clickSuccessful().getTitle().isDisplayed());
    }

    @Test
    public void verifyThatUserCanSubmitNewIssue() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository()
                .opensSuccessful().clickSuccessful().submitSuccessful("Issue Title", "Issue comments");
    }
}


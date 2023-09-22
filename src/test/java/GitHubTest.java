
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GitHubTest extends BaseTest {

    @Test
    public void verifiedThatLoginIsSuccessful() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                getTextOnTheMainPage().isDisplayed());

    }

    @Test
    public void verifiedThatMyRepositoryPageIsOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository();
    }

    @Test
    public void verifiedThatIssuesTabIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().getHeader().isDisplayed());
    }

    @Test
    public void verifiedOpeningIssueTab() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository().opensSuccessful();
    }

    @Test
    public void verifiedButtonIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().opensSuccessful().getButtonOnTheIssuesPage().isDisplayed());
    }

    @Test
    public void verifiedThanNewIssueButtonIsAvailable() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository().
                opensSuccessful().clickSuccessful();
    }

    @Test
    public void verifiedthatTitleFieldIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").
                goToMyRepository().opensSuccessful().clickSuccessful().getTitle().isDisplayed());
    }

    @Test
    public void verifiedThatUserCanSubmitNewIssue() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("olyanovember@gmail.com", "4esZXdr5@").goToMyRepository()
                .opensSuccessful().clickSuccessful().submitSuccessful("Issue Title", "Issue comments");
    }
}


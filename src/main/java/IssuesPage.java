import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    private final static String TITLE = "Issues page";
    private By newIssueButton = By.xpath("/html/body/div[1]/div[6]/div/main/turbo-frame/div/div/div[2]/div[2]/a/span");
    private By createNewIssue = By.xpath("/html/body/div[1]/div[6]/div/main/turbo-frame/div/div[2]/div[2]/a");

    public IssuesPage(WebDriver driver) {
        super(driver,TITLE);
    }

    public WebElement getButtonOnTheIssuesPage() {
        return driver.findElement(newIssueButton);

    }

    public NewIssuePage clickSuccessful () {
        driver.findElement(createNewIssue).click();
        return new NewIssuePage(driver);

    }
}








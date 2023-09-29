import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuePage extends BasePage{
    private final static String TITLE = "New issue page";
private By writeComment = By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/tab-container/div[1]/div/button[1]");
    private By titleFieldLocator = By.xpath("//*[@id=\"issue_title\"]");
    private By leaveACommentLocator =By.xpath("//*[@id=\"issue_body\"]");
    private By submitNewIssueLocator = By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button");


    public WebElement getTitle() {
        return driver.findElement(writeComment);
    }

    public SubmitNewIssuePage submitSuccessful (String title, String comment){
        driver.findElement(titleFieldLocator).sendKeys(title);
        driver.findElement(leaveACommentLocator).sendKeys(comment);
        driver.findElement(submitNewIssueLocator).click();
        return new SubmitNewIssuePage (driver);

    }
    public NewIssuePage(WebDriver driver) {
        super(driver, TITLE);
    }
}

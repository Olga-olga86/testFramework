import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyRepositoryPage extends BasePage {
    private final static String TITLE = "My Repository page";

    private By goToMyRepository = By.xpath("//*[@id=\"repository-container-header\"]/div[1]/div[1]/div[1]/strong/a");
private By issuesTab = By.xpath("//*[@id=\"issues-tab\"]");

    public MyRepositoryPage(WebDriver driver) {
        super(driver, TITLE);
    }


    public WebElement getHeader() {
        return driver.findElement(goToMyRepository);
    }

    public IssuesPage opensSuccessful() {
        driver.findElement(issuesTab).click();
        return new IssuesPage(driver);
    }

}

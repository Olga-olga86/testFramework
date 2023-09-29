import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private final static String TITLE = "Main page";
    private By textLocator = By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/div[2]/nav/ul/li/a");

    private By myRepositoryLink = By.xpath("/html/body/div[1]/div[6]/div/div/aside/div/div/loading-context/div/div[1]/div/ul/li/div/div/a");

    public MainPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getTextOnTheMainPage(){
        return driver.findElement(textLocator);
    }

    public MyRepositoryPage goToMyRepository(){
        driver.findElement(myRepositoryLink).click();
        return new MyRepositoryPage(driver);


        }
    }


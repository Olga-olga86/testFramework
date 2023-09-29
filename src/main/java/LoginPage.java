import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private final static String TITLE = "Login page";
    private By loginFieldLocator = By.id("login_field");
    private By passwordFieldLocator = By.id("password");
    private By submitLoginButtonLocator = By.xpath("//input[@value=\"Sign in\"]");
    public LoginPage(WebDriver driver) {
        super(driver, TITLE);
    }
    public MainPage loginSuccessful (String login, String password){
        log.info("Test is starting");
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(submitLoginButtonLocator).click();
        log.info("Login is successful");
        return new MainPage (driver);

    }
}

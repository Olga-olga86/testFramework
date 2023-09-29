import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By signInButtonLocator = By.xpath("//a[contains(text(), \"Sign in\")]");
    private final static String TITLE = "Home page";
    public HomePage(WebDriver driver) {
        super(driver, TITLE);
    }
    public LoginPage goToLoginPage(){
        driver.findElement(signInButtonLocator).click();
        return new LoginPage(driver);
    }
}

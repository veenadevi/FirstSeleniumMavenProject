import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LTPlayGroundTest {
    @Test //TestNG Annotation
    public void validateCheckBoxStatus (){
        /**WebDriverManager is a open Source API to ease the Browser Initialisation .
        We can skip driver exe path definition**/
       WebDriverManager.firefoxdriver().setup();

        //Chrome Browser Initialised
        WebDriver driver= new FirefoxDriver();

        //Launch the URL
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        //get the WebElement of Check Box

        WebElement singleCheckBox= driver.findElement(By.id("isAgeSelected"));

    System.out.println("Type of WebElement "+String.valueOf(singleCheckBox instanceof WebElement) );
        //click that check box
        singleCheckBox.click();

        //Validate check box is selected or not
        Assert.assertTrue(singleCheckBox.isSelected(),"Checkbox is not selected ");
    }
}

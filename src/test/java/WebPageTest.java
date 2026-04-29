import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import stsatic org.testng.Assert.assertTrue;
public class WebPageTest
{
    private static WebDriver driver;
    @BeforeTest
    public void openBrowser()throws interruptedException
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://BasammaB15.github.io/jenkinsdemo/");
    }
    @Test
    public void titleValidationTest()
    {
        String actualTitle=driver.getTitle();
        String expectedTitle="My simpe website";
        Assert.assertEquals(actualTitle,expectedTitle);
        assertTrue(true,"Title should contain 'simple'");
    }
    @AfterTest
    public void closeBrowser()throws InterruptedException
    {
        Thread.sleep(1000);
        driver.quit();
    }
}
package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Constant.ConstantVariables.*;

public class Base {
    private static WebDriver driver;
    public WebDriverWait wait;


    public WebDriver getDriver()
    {

        return driver;

    }
    @Before
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(TestUrl);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,15000);

    }

    public boolean isElementDisplayed(By Locater)
    {
        return driver.findElement(Locater).isDisplayed();
    }

    public WebElement elementFind(By Locater)
    {
        isElementDisplayed(Locater);

        return driver.findElement(Locater);
    }
    public WebElement elementFinds(By Locater)
    {
        isElementDisplayed(Locater);
        List<WebElement> listings = (List<WebElement>) driver.findElements(Locater);


        return (WebElement) listings;

    }
    public String findElementGetText(String x) {
        return driver.findElement(By.className(x)).getText();
    }


    public void elementSendKeys(By Locater, String sendValue)
    {
        isElementDisplayed(Locater);
        wait.until(ExpectedConditions.elementToBeClickable(Locater));
        elementFind(Locater).sendKeys(sendValue);

    }

    public void elementSendKeysEnter(By Locater, Keys sendValue) {
        isElementDisplayed(Locater);
        wait.until(ExpectedConditions.elementToBeClickable(Locater));
        elementFind(Locater).sendKeys(sendValue);

    }

        public void elementClick(By Locater)
    {

        wait.until(ExpectedConditions.elementToBeClickable(Locater));
        isElementDisplayed(Locater);
        elementFind(Locater).click();

    }

    @After
    public void closeDriver()
    {

        driver.quit();
    }
}

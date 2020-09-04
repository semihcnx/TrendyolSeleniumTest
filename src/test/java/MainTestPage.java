import org.junit.Test;
import Test.AllTest;

import static java.lang.Thread.sleep;

public class MainTestPage extends AllTest  {


    @Test
    public void testRun() throws InterruptedException {
        correctLogin();
        searchBilgisayar();
        randomItemSelect();
        basketItemAdded();
        basketProductIncrease();

    }



   // protected WebDriver driver;


//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        driver=new ChromeDriver();
//
//        driver.get(BasePageUtil.TrendyolUrl);
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void correctLogin() throws InterruptedException {
//
//        String username="cv.semihcan@gmail.com";
//        String password="Kyk.17231650";
//        sleep(1000);
//        BasePageUtil.HomepagePopupClose(driver).click();
//       sleep(1000);
//        BasePageUtil.ButtonAccount(driver).click();
//        sleep(1000);
//        BasePageUtil.InputUsername(driver).sendKeys(username);
//        BasePageUtil.InputPassword(driver).sendKeys(password);
//        BasePageUtil.ButtonLogin(driver).click();
//
//
//    }
//
//    @Test
//    public void search() throws InterruptedException{
//        correctLogin();
//
//
//
//
//        //   PageObjects.notClose(driver).click();
//        //  sleep(10000);
//      /* if(PageObjects.notClose(driver).isEnabled()){
//            sleep(1000);
//
//        }
//
//       */
//
//
//        sleep(3000);
//        String searchText="Bilgisayar";
//        BasePageUtil.InputSearch(driver).sendKeys(searchText);
//        BasePageUtil.InputSearch(driver).sendKeys(Keys.ENTER);
//
//
//
//
//    }
//
//    @Test
//    public void randomSelect() throws  InterruptedException{
//        search();
//        sleep(1000);
//        List<WebElement> listings = driver.findElements(By.cssSelector("div[class='p-card-wrppr']>div>a"));
//        Random r = new Random();
//        int randomValue=0;
//
//        randomValue = r.nextInt(listings.size());
//        listings.get(randomValue).click();
//    }
//
//    @Test
//    public void basketTwo() throws  InterruptedException{
//        randomSelect();
//        sleep(3000);
//
//
//
//        BasePageUtil.AddBasket(driver).click();
//        sleep(3000);
//
//        BasePageUtil.BasketItem(driver).click();
//        sleep(3000);
//
//        if(BasePageUtil.partialBasketpassive(driver).isDisplayed()){
//            driver.findElement(By.className("i-trash")).click();
//            sleep(3000);
//            if(BasePageUtil.contentbody(driver).isDisplayed()){
//                BasePageUtil.ButtonDelete(driver).click();
//            }
//
//        }
//
//        if(driver.findElement(By.className("counter-content")).getAttribute("value")=="2"){
//
//            driver.findElement(By.className("i-trash")).click();
//            sleep(10000);
//            if(BasePageUtil.contentbody(driver).isDisplayed()){
//                BasePageUtil.ButtonDelete(driver).click();
//
//            }
//
//        }
//
//
//
//        else{
//            BasePageUtil.CounterProductIncrease(driver).click();
//            sleep(3000);
//
//            driver.findElement(By.className("i-trash")).click();
//            sleep(10000);
//            if(BasePageUtil.contentbody(driver).isDisplayed()){
//                BasePageUtil.ButtonDelete(driver).click();
//
//            }
//        }
//
//
//
//    }











//    @Test
//
//    public void basketRemove() throws InterruptedException{
//    basketTwo();
//
//
//    }


/*
    @After
    public void close(){
        driver.quit();
    }

*/

}

import Base.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static Constant.ConstansButton.*;
import static Constant.ConstansButton.ButtonDelete;
import static Constant.ConstanstInput.*;
import static Constant.ConstanstInput.InputSearch;
import static Constant.ConstantVariables.*;
import static java.lang.Thread.sleep;

public class MainTest extends Base {


    private WebDriver driver;


    public void HomeTest()
    {
        driver=getDriver();

    }
@Test
    public void loginUser() throws InterruptedException {
        elementClick(By.className(PopupClose));
        elementClick(By.id(ButtonAccount));
        sleep(3000);
        elementSendKeys(By.id(InputUsername), "cv.semihcan@gmail.com");
        elementSendKeys(By.id(InputPassword), "Kyk.17231650");
        elementClick(By.id(ButtonLogin));
    }
@Test
    public void searchBilgisayar() throws InterruptedException {
        loginUser();
        sleep(3000);
        elementSendKeys(By.cssSelector(InputSearch),SearchText);
        elementSendKeysEnter(By.cssSelector(InputSearch), Keys.ENTER);
        sleep(3000);

    }
@Test
    public void randomItemSelect() throws InterruptedException {
        searchBilgisayar();
        sleep(3000);

        /*  BURADA HATA VAR  */
        List<WebElement> listings = driver.findElements(By.cssSelector("div[class='p-card-wrppr']>div>a"));
        Random r = new Random();
        int randomValue=0;
        randomValue = r.nextInt(listings.size());
        listings.get(randomValue).click();

        /*   Randomu listede hata aldığım için; List elementini yorum satırı haline getirip alttaki kodu  çalıştırabilirsiniz   */
      //   elementClick(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/a"));

    }
@Test
    public void basketItemAdded() throws InterruptedException{
    randomItemSelect();
        sleep(3000);
        /*  BURADA HATA VAR  */
        WebElement ProductListPrice = driver.findElement(By.cssSelector("span[class='prc-slg']"));
        String productprice= ProductListPrice.getText();
        System.out.println(productprice+"Ürün Eklemedeki Fiyatı");
        elementClick(By.cssSelector(ButtonAddBasket));
        sleep(3000);
        elementClick(By.id(BasketItem));
        WebElement BasketPrice = driver.findElement(By.cssSelector("span[class='prc-slg']"));
        String basketprice= BasketPrice.getText();
        System.out.println(basketprice+": Sepetteki Fiyatı");
        sleep(3000);

        /* Listedki ürün ile Sepetteki Ürün Fiyatı Karşılaştırması*/
        Assert.assertSame(ProductListPrice,BasketPrice);
    }
@Test
    public void basketProductIncrease() throws InterruptedException{
    basketItemAdded();
        Boolean ButtonPassiveCheck = isElementDisplayed(By.xpath(ButtonPassive));
        System.out.println(ButtonPassiveCheck);
        if (ButtonPassiveCheck ==true)
        {
            elementClick(By.xpath(ButtonIncreament));
            sleep(3000);
            elementClick(By.className("i-trash"));
            sleep(6000);
            elementClick(By.cssSelector(ButtonDelete));
        }

        else if (ButtonPassiveCheck == false) {
            elementClick(By.className("i-trash"));
            sleep(6000);
            elementClick(By.cssSelector(ButtonDelete));
        }
    }



}

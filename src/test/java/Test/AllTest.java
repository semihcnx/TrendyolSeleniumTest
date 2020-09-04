package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Constant.ConstantVariables.*;
import static java.lang.Thread.*;

public class AllTest  extends BasePage{

   private static WebDriver driver;


    public void HomeTest()
    {
        driver=getDriver();

    }

    public void correctLogin() throws InterruptedException {
        elementClick(By.className(PopupClose));
        elementClick(By.id(ButtonAccount));
        sleep(3000);
        elementSendKeys(By.id(InputUsername), "cv.semihcan@gmail.com");
        elementSendKeys(By.id(InputPassword), "Kyk.17231650");
        elementClick(By.id(ButtonLogin));


    }

    public void searchBilgisayar() throws InterruptedException {

        sleep(3000);
        elementSendKeys(By.cssSelector(InputSearch),SearchText);
        elementSendKeysEnter(By.cssSelector(InputSearch), Keys.ENTER);
        sleep(3000);


        String passiveLink ="/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/a";
        String activeLink="/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a";



    }

    public void randomItemSelect() throws InterruptedException {

        sleep(3000);

        /*  BURADA HATA VAR  */
        List<WebElement> list = driver.findElements(By.cssSelector("div[class='p-card-wrppr']>div>a"));
        Random r = new Random();
        int randomValue=0;
        randomValue = r.nextInt(list.size());
        list.get(randomValue).click();
       // elementClick(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/a"));






//        String count = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span[2]")).getText();
//        System.out.println(count);
    }

    public void basketItemAdded() throws InterruptedException{

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

    }

    public void basketProductIncrease() throws InterruptedException{

        Boolean ButtonPassiveCheck = isElementDisplayed(By.xpath("/html/body/div[3]/div[2]/div[2]/section/section[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/button[2]"));
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

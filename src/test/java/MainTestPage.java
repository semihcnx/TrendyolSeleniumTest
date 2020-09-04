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

    

}

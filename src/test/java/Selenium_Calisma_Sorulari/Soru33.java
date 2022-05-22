package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru33 extends TestBase {
    /*
    ● Bir class olusturun: IframeTest02
    1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    2) sayfadaki iframe sayısını bulunuz.

     */

    @Test
    public void test01() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        Integer size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

    }
}

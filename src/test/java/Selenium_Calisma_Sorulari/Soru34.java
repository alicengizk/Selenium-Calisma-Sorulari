package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Soru34 extends TestBase {
    /*
    ● Yeni bir class olusturun: WindowHandle
    ● Amazon anasayfa adresine gidin.
    ● Sayfa’nin window handle degerini String bir degiskene atayin
    ● Sayfa title’nin “Amazon” icerdigini test edin
    ● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
    ● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
    ● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
    ● Sayfa title’nin “Walmart” icerdigini test edin
    ● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
     */

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        String amazonWindowHandle=driver.getWindowHandle();
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.techproeducation.com");
        String actualTitle2=driver.getTitle();
        String expectedTitle2="TECHPROEDUCATION";
        Assert.assertFalse(actualTitle2.contains(expectedTitle2));
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");
        String actualTitle3= driver.getTitle();
        String expectedTitle3="Walmart";
        Assert.assertTrue(actualTitle3.contains(expectedTitle3));
        driver.switchTo().window(amazonWindowHandle);
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);


    }
}

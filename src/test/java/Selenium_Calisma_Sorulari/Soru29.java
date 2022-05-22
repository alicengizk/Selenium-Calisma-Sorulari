package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Soru29 extends TestBase {
    /*
    Yeni bir Class Olusturun : D11_SoftAssert1
    1. “https://www.hepsiburada.com/” Adresine gidin
    2. Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdigini dogrulayin
    3. search kutusuna araba yazip arattirin
    4. bulunan sonuc sayisini yazdirin
    5. sonuc yazisinin "araba" icerdigini dogrulayin
    6. Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin
     */

    @Test
    public void test01() {
        driver.get("https://www.hepsiburada.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("araba"+ Keys.ENTER);
        String sonucSayisi=driver.findElement(By.xpath("//b[@class='searchResultSummaryBar-bold']")).getText();
        System.out.println(sonucSayisi);
        String actualSonucYazisi=driver.findElement(By.xpath("//h1[@class='searchResultSummaryBar-bold']")).getText();
        String expectedSonucYazisi="araba";
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        String expectedIstenmeyenYazi="oto";
        Assert.assertFalse(actualSonucYazisi.contains(expectedIstenmeyenYazi));



    }
}

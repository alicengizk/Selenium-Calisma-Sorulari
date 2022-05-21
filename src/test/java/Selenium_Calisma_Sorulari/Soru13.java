package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru13 extends TestBase {
    /*
    1-C01_TekrarTesti isimli bir class olusturun
    2- https://www.amazon.com/ adresine gidin
    3- Browseri tam sayfa yapin
    4-Sayfayi “refresh” yapin
    5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
    6- Gift Cards sekmesine basin
    7- Birthday butonuna basin
    8- Best Seller bolumunden ilk urunu tiklayin
    9- Gift card details’den 25 $’i secin
    10-Urun ucretinin 25$ oldugunu test edin
    11-Sayfayi kapatin
     */

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        String expectedBaslik="Spend less";
        String baslik=driver.getTitle();
        Assert.assertTrue(baslik.contains(expectedBaslik));
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();
        driver.findElement(By.xpath("//a[@href='/gp/bestsellers/gift-cards/?ie=UTF8&ref_=sv_gc_sv_main_1']")).click();
        driver.findElement(By.xpath("//img[@alt='Amazon.com eGift Card'][1]")).click();
        driver.findElement(By.xpath("//button[@value='25']")).click();
        String expectedFiyat="$25.00";
        String urunFiyati=driver.findElement(By.xpath("//span[text()='$25.00'][1]")).getText();
        Assert.assertEquals(expectedFiyat,urunFiyati);


    }
}

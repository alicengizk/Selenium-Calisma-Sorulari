package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import java.util.List;

public class Soru16 extends TestBase {
    /*
    1-C01_TekrarTesti isimli bir class olusturun
    2- https://www.google.com/ adresine gidin
    3- cookies uyarisini kabul ederek kapatin
    4-Sayfa basliginin “Google” ifadesi icerdigini test edin
    5- Arama cubuguna “Nutella” yazip aratin
    6-Bulunan sonuc sayisini yazdirin
    7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    8-Sayfayi kapatin
     */

    @Test
    public void test01() {
        driver.get("https://www.google.com/");
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Nutella"+ Keys.ENTER);
        String sonucSayisi=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println("Nutella Arama Sonuc : "+sonucSayisi);
        String sonucsayilari=sonucSayisi.replaceAll("\\D", "");
        double cikanRakam=Double.parseDouble(sonucsayilari);
        if (cikanRakam/10000000>1){
            System.out.println("Cikan Sonuc 10 Milyondan Fazla");
        }else {
            System.out.println("Cikan Sonuc 10 Milyondan Az");
        }

    }
}

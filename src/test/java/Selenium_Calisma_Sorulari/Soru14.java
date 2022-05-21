package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru14 extends TestBase {
    /*
    Class Work Amazon Search Test
    1- https://www.amazon.com/ sayfasina gidelim
    2- arama kutusunu locate edelim
    3- “Samsung headphones” ile arama yapalim
    4- Bulunan sonuc sayisini yazdiralim
    5- Ilk urunu tiklayalim
    6- Sayfadaki tum basliklari yazdiralim
     */

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
        String sonucSayisi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'][1]")).getText();
        System.out.println(sonucSayisi);
        driver.findElement(By.xpath("//img[@data-image-source-density='1'][1]")).click();
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}

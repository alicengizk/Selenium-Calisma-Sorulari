package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru27 extends TestBase {
    /*
    ● Bir class oluşturun: DependsOnTest
    ● https://www.amazon.com/ adresine gidin.
    1. Test : Amazon ana sayfaya gittiginizi test edin
    2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
arama yapin ve aramanizin gerceklestigini Test edin
    3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
$16.83 oldugunu test edin
     */

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+Keys.ENTER);
        String actualAramaSonucu=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        String expectedAramaSonucu="\"Nutella\"";
        Assert.assertEquals(expectedAramaSonucu,actualAramaSonucu);
        driver.findElement(By.xpath("//img[@class='s-image'][1]")).click();
        String fiyat=driver.findElement(By.xpath("//span[@class='a-size-base a-color-price']")).getText();
        System.out.println(fiyat);
        String expectedFiyat="$14.99";
        Assert.assertEquals(expectedFiyat,fiyat);








    }
}

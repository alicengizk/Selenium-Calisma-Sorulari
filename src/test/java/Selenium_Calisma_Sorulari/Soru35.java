package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
import java.util.Set;

public class Soru35 extends TestBase {
    /*
    ● Tests package’inda yeni bir class olusturun: WindowHandle2
    ● https://the-internet.herokuapp.com/windows adresine gidin.
    ● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    ● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    ● Click Here butonuna basın.
    ● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    ● Sayfadaki textin “New Window” olduğunu doğrulayın.
    ● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
doğrulayın.
     */

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String actualYazi=driver.findElement(By.tagName("h3")).getText();
        String expectedYazi="Opening a new window";
        Assert.assertEquals(expectedYazi,actualYazi);
        String actualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        String ilkSayfaHandle=driver.getWindowHandle();
        Set<String> handleSet=driver.getWindowHandles();
        String ikinciSayfaHandle="";
        for (String each:handleSet
             ) {
            if (!each.equals(ilkSayfaHandle)){
                ikinciSayfaHandle=each;
            }

        }
        driver.switchTo().window(ikinciSayfaHandle);
        String actualYeniTitle= driver.getTitle();
        String expectedYeniTitle="New Window";
        Assert.assertEquals(expectedYeniTitle,actualYeniTitle);
        String yeniSayfaYazi=driver.findElement(By.tagName("h3")).getText();
        String yeniSayfaIstenenYazi="New Window";
        Assert.assertEquals(yeniSayfaIstenenYazi,yeniSayfaYazi);
        driver.switchTo().window(ilkSayfaHandle);
        String actualTitle2=driver.getTitle();
        String expectedTitle2="The Internet";
        Assert.assertEquals(expectedTitle2,actualTitle2);






    }
}

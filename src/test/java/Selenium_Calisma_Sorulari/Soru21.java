package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru21 extends TestBase {
    /*
    1) Bir class oluşturun: YoutubeAssertions
    2) https://www.youtube.com adresine gidin
    3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
        ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     */

    @Test
    public void test01() {
        driver.get("https://www.youtube.com");
        String expectedTitle="YouTube";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.findElement(By.id("logo-icon")).isDisplayed();
        driver.findElement(By.id("search")).isEnabled();
        String expectedwrongTitle="youtube";
        Assert.assertFalse(actualTitle.equals(expectedwrongTitle));



    }
}

package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru20 extends TestBase {
    /*
    1) Bir class oluşturun: BestBuyAssertions
    2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki
testleri yapin
        ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        ○ logoTest => BestBuy logosunun görüntülendigini test edin
        ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */

    @Test
    public void test01() {
        driver.get("https://www.bestbuy.com/");
        String expectedUrl="https://www.bestbuy.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        String istenmeyenTitle="Rest";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(istenmeyenTitle));
        WebElement logo=driver.findElement(By.xpath("//img[@class='logo']"));
        logo.isDisplayed();
        WebElement fransizcaLink=driver.findElement(By.xpath("//*[text()='Français']"));
        fransizcaLink.isDisplayed();


    }
}

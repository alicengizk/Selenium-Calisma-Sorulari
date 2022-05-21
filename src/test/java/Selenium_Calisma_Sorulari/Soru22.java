package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru22 extends TestBase {
    /*
    1. Bir Class olusturalim YanlisEmailTesti
    2. http://automationpractice.com/index.php sayfasina gidelim
    3. Sign in butonuna basalim
    4. Email kutusuna @isareti olmayan bir mail yazip enter’a
bastigimizda “Invalid email address” uyarisi ciktigini test edelim
     */

    @Test
    public void test01() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email_create")).sendKeys("alicengizgmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.xpath("//*[text()='Invalid email address.']")).isDisplayed();

    }
}

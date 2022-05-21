package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru17 extends TestBase {
    /*
    1. “https://www.saucedemo.com” Adresine gidin
    2. Username kutusuna “standard_user” yazdirin
    3. Password kutusuna “secret_sauce” yazdirin
    4. Login tusuna basin
    5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    6. Add to Cart butonuna basin
    7. Alisveris sepetine tiklayin
    8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
    9. Sayfayi kapatin
     */

    @Test
    public void test01() {

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        String expectedItem="Sauce Labs Backpack";
       String actualItem= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        Assert.assertEquals(expectedItem,actualItem);



    }
}

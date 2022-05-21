package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru15 extends TestBase {
    /*
    1. http://zero.webappsecurity.com sayfasina gidin
    2. Signin buttonuna tiklayin
    3. Login alanine “username” yazdirin
    4. Password alanine “password” yazdirin
    5. Sign in buttonuna tiklayin
    6. Pay Bills sayfasina gidin
    7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
    8. tarih kismina “2020-09-10” yazdirin
    9. Pay buttonuna tiklayin
    10. “The payment was successfully submitted.” mesajinin ciktigini control edin
     */

    @Test
    public void test01() {
        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("50");
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        String expectedPaymentSubmitted="The payment was successfully submitted.";
        String actualPaymentSubmitted=driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']")).getText();
        Assert.assertEquals(expectedPaymentSubmitted,actualPaymentSubmitted);







    }
}

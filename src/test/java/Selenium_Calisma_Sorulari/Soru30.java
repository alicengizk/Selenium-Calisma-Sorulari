package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru30 extends TestBase {
    /*
    ● Bir class olusturun: Alerts
    ● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    ● Bir metod olusturun: acceptAlert
        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
    “You successfully clicked an alert” oldugunu test edin.
    ● Bir metod olusturun: dismissAlert
        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    “successfuly” icermedigini test edin.
    ● Bir metod olusturun: sendKeysAlert
        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
     */

    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        String actualResult1=driver.findElement(By.id("result")).getText();
        String expectedResult1="You successfully clicked an alert";
        Assert.assertEquals(expectedResult1,actualResult1);
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        String actualResult2=driver.findElement(By.id("result")).getText();
        String expectedResult2="successfuly";
        Assert.assertFalse(actualResult2.contains(expectedResult2));
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Ali Cengiz");
        driver.switchTo().alert().accept();
        String actualResult3=driver.findElement(By.id("result")).getText();
        String expectedResult3="Ali Cengiz";
        Assert.assertTrue(actualResult3.contains(expectedResult3));


    }
}

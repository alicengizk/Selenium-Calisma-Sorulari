package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Soru26 extends TestBase {
    /*
    1. http://zero.webappsecurity.com/ Adresine gidin
    2. Sign in butonuna basin
    3. Login kutusuna “username” yazin
    4. Password kutusuna “password.” yazin
    5. Sign in tusuna basin
    6. Pay Bills sayfasina gidin
    7. “Purchase Foreign Currency” tusuna basin
    8. “Currency” drop down menusunden Eurozone’u secin
    9. “amount” kutusuna bir sayi girin
    10. “US Dollars” in secilmedigini test edin
    11. “Selected currency” butonunu secin
    12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
    13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin
     */

    @Test
    public void test01() {
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
        WebElement ddm=driver.findElement(By.id("pc_currency"));
        Select select=new Select(ddm);
        select.selectByValue("EUR");
        driver.findElement(By.id("pc_amount")).sendKeys("50");
        WebElement usDolarCheck=driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(usDolarCheck.isSelected());
        driver.findElement(By.id("pc_inDollars_false")).click();
        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();
        driver.findElement(By.id("alert_content")).isDisplayed();



    }
}

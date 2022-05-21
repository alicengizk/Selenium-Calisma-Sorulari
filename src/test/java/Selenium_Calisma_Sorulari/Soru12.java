package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru12 extends TestBase {
    /*
    1 ) Bir class oluşturun : Locators_css
    2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
    NOT: cssSelector kullanarak elementleri locate ediniz.
     */

    @Test
    public void test01() {
     driver.get("http://a.testaddressbook.com/sign_in");
        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("testtechproed@gmail.com");


    }
}

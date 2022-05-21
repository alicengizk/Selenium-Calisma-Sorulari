package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru19 extends TestBase {
    /*
    1. Bir class oluşturun : RadioButtonTest
    2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        - https://www.facebook.com adresine gidin
        - Cookies’i kabul edin
        - “Create an Account” button’una basin
        - “radio buttons” elementlerini locate edin
        - Secili degilse cinsiyet butonundan size uygun olani secin
     */

    @Test
    public void test01() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
        WebElement radioFemale=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement radioMale=driver.findElement(By.xpath("//input[@value='2']"));
        WebElement radioOTher=driver.findElement(By.xpath("//input[@value='-1']"));
        radioMale.click();


    }
}

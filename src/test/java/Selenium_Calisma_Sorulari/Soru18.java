package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru18 extends TestBase {
    /*
    1. Bir class oluşturun : CheckBoxTest
    2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin.
            https://the-internet.herokuapp.com/checkboxes
        b. Checkbox1 ve checkbox2 elementlerini locate edin.
        c. Checkbox1 seçili değilse onay kutusunu tıklayın
        d. Checkbox2 seçili değilse onay kutusunu tıklayın
     */

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        Thread.sleep(3000);
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(3000);

        if (!checkbox2.isSelected()){
            checkbox2.click();
        }



    }
}

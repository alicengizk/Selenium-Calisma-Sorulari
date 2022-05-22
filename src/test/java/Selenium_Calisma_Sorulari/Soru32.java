package Selenium_Calisma_Sorulari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.awt.*;

public class Soru32 extends TestBase {
    /*
    ● Bir class olusturun: IframeTest
    ● https://the-internet.herokuapp.com/iframe adresine gidin.
    ● Bir metod olusturun: iframeTest
        ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        ○ Text Box’a “Merhaba Dunya!” yazin.
        ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
dogrulayin ve konsolda yazdirin.
     */

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.findElement(By.tagName("h3")).isDisplayed();
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        WebElement iframeKutusu=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeKutusu);
        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Hello World");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).isDisplayed();

    }
}

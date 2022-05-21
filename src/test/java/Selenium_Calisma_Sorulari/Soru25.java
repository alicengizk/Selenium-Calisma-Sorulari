package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Soru25 extends TestBase {
    /*
    ● Bir class oluşturun: C3_DropDownAmazon
    ● https://www.amazon.com/ adresine gidin.
    - Test 1
    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
oldugunu test edin
    -Test 2
    1. Kategori menusunden Books secenegini secin
    2. Arama kutusuna Java yazin ve aratin
    3. Bulunan sonuc sayisini yazdirin
    4. Sonucun Java kelimesini icerdigini test edin
     */

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/ ");
        WebElement ddm=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
        Select select=new Select(ddm);
        List<WebElement> ddmSize=select.getOptions();
        if (ddmSize.size()==45){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        select.selectByVisibleText("Books");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+ Keys.ENTER);
        System.out.println("Results = " + driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
        String expectedWord="Java";
        String actualWord=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        Assert.assertTrue(actualWord.contains(expectedWord));


    }
}

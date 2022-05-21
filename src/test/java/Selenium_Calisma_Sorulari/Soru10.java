package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru10 extends TestBase {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3- Delete butonu’nun gorunur oldugunu test edin
    4- Delete tusuna basin
    5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        Assert.assertTrue(deleteButonu.isDisplayed());
        deleteButonu.click();
        WebElement addRemoveYazisi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(addRemoveYazisi.isDisplayed());
    }
}

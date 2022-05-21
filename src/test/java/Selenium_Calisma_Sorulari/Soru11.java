package Selenium_Calisma_Sorulari;

import org.junit.Test;
import utilities.TestBase;

public class Soru11 extends TestBase {
    /*
    Asagidaki testi text’leri kullanarak locate edin
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3- Delete butonu’nun gorunur oldugunu test edin
    4- Delete tusuna basin
    5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */

    @Test
    public void test01() {
       driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


    }
}

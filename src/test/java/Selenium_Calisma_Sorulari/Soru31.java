package Selenium_Calisma_Sorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import javax.swing.*;

public class Soru31 extends TestBase {
    /*
    1- Bir class olusturun : BasicAuthentication
    2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
    3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        Html komutu : https://username:password@URL
        Username : admin
        password : admin
    4- Basarili sekilde sayfaya girildigini dogrulayin
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
     */

    @Test
    public void test01() {
        String username="admin";
        String password="admin";
        String URl= "https://"+username+":"+password+"@"+ "the-internet.herokuapp.com/basic_auth";
        System.out.println(URl);
        driver.get(URl);
        String expectedURL="https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertEquals(expectedURL,URl);




    }
}

package Selenium_Calisma_Sorulari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru6 {
    /*
    1.Yeni bir class olusturalim (Homework)
    2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
    4.https://www.walmart.com/ sayfasina gidin.
    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    6. Tekrar “facebook” sayfasina donun
    7. Sayfayi yenileyin
    8. Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin
    */

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test6(){
        driver.get("http://www.facebook.com");
        if (driver.getTitle().equals("facebook")){
            System.out.println("Title test verify");
        }else {
            System.out.println(driver.getTitle());
        }
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Title Contains Test PASSED");
        }else {
            System.out.println(driver.getTitle());
        }
        driver.get("https://www.walmart.com/");
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Walmart Title Test PASSED");
        }else {
            System.out.println("Walmart Title Test FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }


}

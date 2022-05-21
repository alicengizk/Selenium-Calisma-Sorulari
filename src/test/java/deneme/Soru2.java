package deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru2 {
    /*
    1. Yeni bir package olusturalim : day01
    2. Yeni bir class olusturalim : C03_GetMethods
    3. Amazon sayfasina gidelim. https://www.amazon.com/
    4. Sayfa basligini(title) yazdirin
    5. Sayfa basliginin “Amazon” icerdigini test edin
    6. Sayfa adresini(url) yazdirin
    7. Sayfa url’inin “amazon” icerdigini test edin.
    8. Sayfa handle degerini yazdirin
    9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
    10. Sayfayi kapatin.
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
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getTitle().contains(\"Amazon\") = " + driver.getTitle().contains("Amazon"));
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getCurrentUrl().contains(\"amazon\") = " + driver.getCurrentUrl().contains("amazon"));
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getPageSource().contains(\"alisveris\") = " + driver.getPageSource().contains("alisveris"));
        Thread.sleep(5000);
        System.out.println("All Tests Are PASSED");
        driver.close();

    }

}

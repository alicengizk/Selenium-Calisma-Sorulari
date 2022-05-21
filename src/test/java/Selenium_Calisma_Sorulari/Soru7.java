package Selenium_Calisma_Sorulari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru7 {
    /*
    1. Yeni bir class olusturun (TekrarTesti)
    2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
    4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    5. Youtube sayfasina geri donun
    6. Sayfayi yenileyin
    7. Amazon sayfasina donun
    8. Sayfayi tamsayfa yapin
    9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
    10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
    11.Sayfayi kapatin
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
    public void test7(){
        driver.get("https://www.youtube.com");
        if (driver.getTitle().equals("youtube")){
            System.out.println("verify");
        }else {
            System.out.println(driver.getTitle());
        }
        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("URL Test PASSED");
        }else {
            System.out.println("https://www.youtube.com");
        }
        driver.get("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Amazon Title Test PASSED");
        }else {
            System.out.println(driver.getTitle());
        }
        if (driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("Amazon URL Test PASSED");
        }else {
            System.out.println("https://www.amazon.com/");
        }
        driver.close();
    }

}


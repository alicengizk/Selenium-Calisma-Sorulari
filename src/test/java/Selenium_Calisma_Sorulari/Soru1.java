package Selenium_Calisma_Sorulari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru1 {
    /*
    1. Yeni bir class oluşturun: class name ⇒ C01_Get,
    2. main method olusturun,
    3. Java’dan System.setProperty(“”,””) method’unu kullanarak webdriver’in turunu ve path’ini
belirleyelim.
    4. Chrome driver oluşturun
    5. Olusturdugumuz driver objesi ile WebDriver class’indan static method’lari kullanin
     */

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void cikis() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}

package deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class Soru5 {
    /*
    1. Yeni bir Class olusturalim.C07_ManageWindowSet
    2. Amazon soyfasina gidelim. https://www.amazon.com/
    3. Sayfanin konumunu ve boyutlarini yazdirin
    4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
    5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
    6. Sayfayi kapatin
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
    public void test5(){
        driver.get("https://www.amazon.com");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(900,800));
        driver.manage().window().setPosition(new Point(0,15));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.close();


    }


}

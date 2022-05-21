package deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    /*
    Tekrar Testi
1-C01_TekrarTesti isimli bir class olusturun
2- https://www.amazon.com/ adresine gidin
3- Browseri tam sayfa yapin
4-Sayfayi “refresh” yapin
5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
6- Gift Cards sekmesine basin
7- Birthday butonuna basin
8- Best Seller bolumunden ilk urunu tiklayin
9- Gift card details’den 25 $’i secin
10-Urun ucretinin 25$ oldugunu test edin
10-Sayfayi kapatin
     */
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void cikis(){
        driver.close();
    }


    @Test
    public void tekrarTesi() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        String baslik=driver.getTitle();
        if (baslik.contains("Spend less")){
            System.out.println("Title Test PASSED");
        }else {
            System.out.println("Title Test FAILED");
        }
        driver.findElement(By.xpath("//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        driver.findElement(By.xpath("//a[@aria-label='Birthday gift cards']")).click();
        driver.findElement(By.xpath("//a[@href='/gp/bestsellers/gift-cards/?ie=UTF8&ref_=sv_gc_sv_main_1']")).click();
        driver.findElement(By.xpath("//img[@alt='Amazon.com eGift Card'][1]")).click();
        driver.findElement(By.xpath("//button[@value='25']")).click();
        String giftCard= String.valueOf(driver.findElement(By.xpath("//*[text()='$25.00'][1]")));
        if (giftCard.contains("$25.00")){
            System.out.println("Gift Card Test PASSED");
        }else {
            System.out.println("Gift Card Test FAILED");
        }
        Thread.sleep(5000);

    }

}

package deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru8 {
    /*
    1. Bir class oluşturun: LoginTest
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun
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
    public void test8(){
        driver.get("http://a.testaddressbook.com");
        driver.findElement(By.xpath("//a[@id='sign-in']")).click();
        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signIn.click();
        if (driver.findElement(By.xpath("//span[@data-test='current-user']")).equals("testtechproed@gmail.com")){
            System.out.println("User Id Test PASSED");
        }else {
            System.out.println("User Id Test FAILED");
        }
        driver.findElement(By.xpath("//a[@data-test='addresses']")).isDisplayed();
        driver.findElement(By.xpath("//a[@data-test='sign-out']")).isDisplayed();
        System.out.println("driver.getPageSource().indexOf(\"<a\") = " + driver.getPageSource().indexOf("a"));



    }


}

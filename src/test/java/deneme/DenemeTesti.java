package deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.time.Duration;

public class DenemeTesti {

    /*
  1. Launch browser
  2. Navigate to url 'http://automationexercise.com'
  3. Verify that home page is visible successfully
  4. Click on 'Signup / Login' button
  5. Verify 'New User Signup!' is visible
  6. Enter name and email address
  7. Click 'Signup' button
  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
  9. Fill details: Title, Name, Email, Password, Date of birth
  10. Select checkbox 'Sign up for our newsletter!'
  11. Select checkbox 'Receive special offers from our partners!'
  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  13. Click 'Create Account button'
  14. Verify that 'ACCOUNT CREATED!' is visible
  15. Click 'Continue' button
  16. Verify that 'Logged in as username' is visible
  17. Click 'Delete Account' button
  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
*/
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void cikis(){
        driver.close();
    }

    @Test
    public void navigate() throws InterruptedException {
        driver.get("http://automationexercise.com");
        WebElement homePage = driver.findElement(By.xpath("//a[@href='/']"));
        if (homePage.isDisplayed()) {
            System.out.println("Home Page Test PASSED");
        } else {
            System.out.println("Home Page Test FAILED");
        }
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        WebElement newUser=driver.findElement(By.cssSelector("div[class='signup-form'] h2"));
        if (newUser.isDisplayed()){
            System.out.println("New User Test PASSED");
        } else System.out.println("New User Test FAILED");
        WebElement userName=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        userName.sendKeys("Ali Cengiz");
        email.sendKeys("alicengizz@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        WebElement enterAccount=driver.findElement(By.xpath("//h2[@class='title text-center'][1]"));
        if (enterAccount.isDisplayed()){
            System.out.println("Enter Account Test PASSED");
        } else {
            System.out.println("Enter Account Test FAILED");
        }
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//select[@id='days']")).sendKeys("3");
        driver.findElement(By.xpath("//select[@id='months']")).sendKeys("6");
        driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1982");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ali Cengiz");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kasar");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Kozmedop");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Ertugrulgazi Mah");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Emek Cad, No: 25");
        driver.findElement(By.xpath("//select[@id='country']")).sendKeys("United States");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Florida");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Miami");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("16320");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("5418437855");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        WebElement accountCreated=driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
        if (accountCreated.isDisplayed()){
            System.out.println("Create Account PASSED");
        }else {
            System.out.println("Create Account FAILED");
        }
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        WebElement loginnedUser=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        if (loginnedUser.isDisplayed()){
            System.out.println("Login Name Test PASSED");
        }else {
            System.out.println("Login Name Test FAILED");
        }
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(15000);

    }




    }


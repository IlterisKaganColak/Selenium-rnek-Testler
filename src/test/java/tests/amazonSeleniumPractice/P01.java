package tests.amazonSeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class P01 {

    WebDriver driver;

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void teardown(){

        //driver.quit();

    }

    @Test
    public void primeVideoTesti(){

        //1. Go to https://www.primevideo.com/
        driver.get("https://www.primevideo.com/");

        //2. Accept cookies
        driver.findElement(By.xpath("(//button[@class='_9cPpOT'])[1]")).click();

        //3. Click on the text with the "Prime Member? Sign in" box
        driver.findElement(By.linkText("Prime Member? Sign in")).click();

        //4. Click on the "Create your Amazon account" box
        driver.findElement(By.xpath("(//span[@class='a-button-inner'])[2]")).click();

        //5. Locate the "first and last name" box and Type “name and username” in the First and last name box
        WebElement firstAndLastNameBox = driver.findElement(By.id("ap_customer_name"));
        firstAndLastNameBox.sendKeys("Cristiano Ronaldo");

        //6. Click on the "Use your email instead" box instead of your mobile number
        driver.findElement(By.id("ap_use_email")).click();

        //7. locate the email box and click on it
        WebElement EmailBox = driver.findElement(By.id("ap_email"));
        EmailBox.sendKeys("Cristiano_Ronaldo_TheGoat@gmail.com");

        //8. Locate the password address and click
        WebElement passwordBox = driver.findElement(By.id("ap_password"));
        passwordBox.sendKeys("IamTheGoat39");

        //9. Click the "Create your Amazon account" box
        driver.findElement(By.xpath("(//*[@class='a-button-input'])[2]")).click();




    }
}


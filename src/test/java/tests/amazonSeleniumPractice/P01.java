package tests.amazonSeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.findElement(By.xpath("(//*[@class='_9cPpOT YdrMSx'])[1]")).click();

        //3. Click on the text with the "Prime Member? Sign in" box
        driver.findElement(By.linkText("Prime Member? Sign in")).click();

        //4. Click on the "Create your Amazon account" box
        driver.findElement(By.xpath("(//span[@class='a-button-inner'])[2]")).click();

        //5. Type “name and username” in the First and last name box
        WebElement firstAndLastNamebBox = driver.findElement(By.id("ap_customer_name"));
        firstAndLastNamebBox.sendKeys("George Button");

        //6.


    }
}


package tests.ornekTestler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P03 extends TestBase {

    //a. Verilen web sayfasına gidin.
    //https://facebook.com
    //b. Cookies’i kabul edin
    //c. Create an account buton’una basin
    //d. Radio button elementlerini locate edin ve size uygun olani secin
    //e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin




    @Test
    public void facebookTesti(){

        driver.get("https://facebook.com");


        WebElement yeniKullaniciElementi = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

        ReusableMethods.bekle(1);

        yeniKullaniciElementi.click();

        WebElement kadinCinsiyet = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));

        WebElement erkekCinsiyet = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
        erkekCinsiyet.click();

        WebElement OzelCinsiyet = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));

        Assert.assertTrue(erkekCinsiyet.isSelected());
        Assert.assertFalse(kadinCinsiyet.isSelected());
        Assert.assertFalse(OzelCinsiyet.isSelected());






        ReusableMethods.bekle(2);


    }

}

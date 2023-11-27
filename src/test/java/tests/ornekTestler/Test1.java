package tests.ornekTestler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P01 extends TestBase {

    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //a. Verilen web sayfasına gidin.
    //https://the-internet.herokuapp.com/checkboxes
    //b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //c. Checkbox1 seçili değilse onay kutusunu tıklayın
    //d. Checkbox2 seçili değilse onay kutusunu tıklayın
    //e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin

@Test
    public void herOkuApp(){

    driver.get("https://the-internet.herokuapp.com/checkboxes");

    WebElement checkBoxBir = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

    WebElement checkBoxIki = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

    Assert.assertFalse(checkBoxBir.isSelected());

    checkBoxBir.click();

    Assert.assertTrue(checkBoxIki.isSelected());






}



}


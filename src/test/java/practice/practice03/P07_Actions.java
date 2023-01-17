package practice.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P07_Actions extends TestBase {
    /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Son olarak sayfayı temizleyiniz
     */

    @Test
    public void test01(){

        driver.get("http://szimek.github.io/signature_pad/");
        WebElement  aa = driver.findElement(By.xpath("//canvas"));
        Actions actions = new Actions(driver);
        actions.moveToElement(aa).clickAndHold();

        for (int  i = 0 ; i<10 ; i++){
            actions.moveByOffset(-5,-5);
        }


        for (int  i = 0 ; i<10 ; i++){
            actions.moveByOffset(0,5);
        }

        for (int  i = 0 ; i<10 ; i++){
            actions.moveByOffset(5,0);
        }
        actions.release().build().perform();

        waitFor(3);

        driver.findElement(By.xpath("//*[.='Clear']")).click();

    }

}

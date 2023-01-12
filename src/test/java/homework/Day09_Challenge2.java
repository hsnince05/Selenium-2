package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import java.util.Set;

public class Day09_Challenge2 extends TestBase {



    @Test
    public void windowHandle(){


        //      url'ye git: http://demo.guru99.com/popup.php
        driver.get("http://demo.guru99.com/popup.php");

        //       ilk pencereyi al
        String ilkpencere = driver.getWindowHandle();

        //       "Click Here" butonuna tıklayın
        driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();

        //       setteki tüm pencereyi al
        Set<String >allWindows= driver.getWindowHandles();

        //       diğer pencereye geç
        String ikinciPencere="";
        for (String w : allWindows){
            if (!w.equals(ilkpencere)){
               ikinciPencere=w;
            }
        }
        driver.switchTo().window(ikinciPencere);


        //       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
        driver.findElement(By.xpath("//input[@name ='emailid']")).sendKeys("somepne@gmail.com");


        //       Gönder düğmesine tıklayarak
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        //       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
        Assert.assertEquals("This access is valid only for 20 days.", driver.findElement(By.tagName("h3")).getText());

        //       Tekrar ilk pencereye geç
        driver.switchTo().window(ilkpencere);

        //       İlk pencerede olduğunu doğrula
        Assert.assertTrue(driver.getCurrentUrl().contains("popup.php"));




    }

}

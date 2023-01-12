package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class HandleWindow extends TestBase {


    @Test
    public void HandleWindow(){

        //https://testcenter.techproeducation.com/index.php?page=multiple-windows
        driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");

        // Title'in "Windows" oldugunu test edin
        String pencere1 = driver.getWindowHandle();
        String baslik1 = driver.getTitle();
        Assert.assertEquals("Windows",baslik1);

        //Click here a tiklayin
        driver.findElement(By.xpath("//a[@href='index.php?page=new-windows']")).click();

        // Sonra acilan sayfadaki title in "New Window" oldugunu dogrulayin
        Set<String>  sayfalar= driver.getWindowHandles();
        for (String w : sayfalar){
            if (!w.equals(pencere1)){
                driver.switchTo().window(w);
                break;
            }
        }
        String baslik2 = driver.getTitle();
        Assert.assertEquals("New Window",baslik2);





    }

}

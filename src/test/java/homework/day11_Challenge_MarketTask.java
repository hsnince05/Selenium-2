package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class day11_Challenge_MarketTask extends TestBase {

    @Test
    public void test01(){
        //Go to https://www.amazon.com.tr/
        driver.get("https://www.amazon.com.tr/");

        //Search iPhone13 512
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iPhone13 512", Keys.ENTER);

        //Check that the results are listed
        List<WebElement> iphone = driver.findElements(By.xpath("//*[@class='s-image']"));
        iphone.stream().forEach(t-> System.out.println(t.getText()));

        waitFor(2);
        //Click iPhone13 at the top of the list

        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();
        waitFor(2);

        //Log the following values for each size .Size information .Price .Color .Stock status
        String isim = driver.findElement(By.xpath("//*[@id='productTitle']")).getText();
        System.out.println(isim);




    }
}

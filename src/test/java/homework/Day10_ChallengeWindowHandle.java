package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.List;

public class Day10_ChallengeWindowHandle extends TestBase {


    @Test
    public void Test01(){

        // https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");
        String window1Handle = driver.getWindowHandle();
        System.out.println("window1Handle = " + window1Handle);

        // Alerts, Frame & Windows Butonuna click yap
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();

        //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
        String actual=driver.findElement(By.xpath("//*[.='Please select an item from left to start practice.']")).getText();
        Assert.assertTrue(actual.contains("Please select an item from left to start practice."));

        //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
        driver.findElement(By.xpath("(//li[@id='item-0'])[3]")).click();


        //New Tab butonunun görünür olduğunu doğrula
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tabButton']")).isDisplayed());

        //New Tab butonuna click yap
        driver.findElement(By.xpath("//*[@id='tabButton']")).click();

        //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
        switchToWindow(1);
        String actual2 = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
        String expected = "This is a sample page";
        Assert.assertEquals(actual2,expected);

        //İlk Tab'a geri dön
        switchToWindow(0);

        ////New Tab butonunun görünür olduğunu doğrula
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tabButton']")).isDisplayed());


    }


}

package homework;

import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Day06Challenge extends TestBase {


    @Test
    public void Test() throws InterruptedException {

// Given kullanici "https://editor.datatables.net/" sayfasina gider
        driver.get("https://editor.datatables.net/");
//    Then new butonuna basar
        driver.findElement(By.xpath("//button[@class='dt-button buttons-create']")).click();
        Thread.sleep(2000);

//    And editor firstname kutusuna "<firstName>" bilgileri girer
        driver.findElement(By.id("DTE_Field_first_name")).sendKeys("Hasan");
        Thread.sleep(2000);

//    And editor lastname kutusuna "<lastName>" bilgileri girer
        driver.findElement(By.id("DTE_Field_last_name")).sendKeys("INCe");
        Thread.sleep(2000);

//    And editor position kutusuna "<position>" bilgileri girer
        driver.findElement(By.id("DTE_Field_position")).sendKeys("Software Engineer");
        Thread.sleep(2000);

//    And editor office kutusuna "<office>" bilgileri girer
        driver.findElement(By.id("DTE_Field_office")).sendKeys("Turkey");
        Thread.sleep(2000);

//    And editor extension kutusuna "<extension>" bilgileri girer
        driver.findElement(By.id("DTE_Field_extn")).sendKeys("aaaa");
        Thread.sleep(2000);


//    And editor startdate kutusuna "<startDate>" bilgileri girer
        driver.findElement(By.id("DTE_Field_start_date")).sendKeys("2022-12-25");
        Thread.sleep(2000);


//    And editor salary kutusuna "<salary>" bilgileri girer
        driver.findElement(By.id("DTE_Field_salary")).sendKeys("150000");
        Thread.sleep(2000);

//    When Create tusuna basar
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        Thread.sleep(2000);

//    Then Kullanıcının eklendiğini doğrular.
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Hasan",Keys.ENTER);
        String actual= driver.findElement(By.xpath("//td[2]")).getText();
        String isim = "Hasan";
        Assert.assertTrue(actual.contains(isim));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class= 'sorting_1']")).click();

  //  And Eklediği kullanıcı kaydını siler
        driver.findElement(By.xpath("//*[@class='dt-button buttons-selected buttons-remove']")).click();
        driver.findElement(By.xpath("//*[@class='btn']")).click();

        Thread.sleep(2000);


//    Then Kullanıcinin silindiğini doğrular.
        String actual2= driver.findElement(By.xpath("//*[@valign='top']")).getText();
        Assert.assertEquals(actual2,"No matching records found");


    }
}

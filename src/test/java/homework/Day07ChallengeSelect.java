package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Day07ChallengeSelect extends TestBase {

    @Test
    public void test01(){
        //1-"https://rahulshettyacademy.com/AutomationPractice/" adresine gidin
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
        WebElement dropWxample = driver.findElement(By.xpath("//*[.='Dropdown Example']"));
        Assert.assertTrue(dropWxample.isDisplayed());


        //3-Option3 ü seçin.
        WebElement dropdownOption= driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdownOption);
        select.selectByValue("option3");


        //4-Option3 ün seçili olduğunu doğrulayı
        String opt3 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(opt3,"Option3");
    }








}

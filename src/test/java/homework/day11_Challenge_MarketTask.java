package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class day11_Challenge_MarketTask extends TestBase {

    @Test
    public void test01(){
        //Go to https://www.amazon.com.tr/
        driver.get("https://www.amazon.com.tr/");

        //Search iPhone13 512
        driver.findElement(By.xpath(""));
        //Check that the results are listed
        //Click iPhone13 at the top of the list
        //Log the following values for each size .Size information .Price .Color .Stock status


    }
}

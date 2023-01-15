package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class day15_Challenge_WebTables extends TestBase {

    @Test
    public void test(){

        //https://www.way2automation.com/angularjs-protractor/webtables/
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");

        //tüm E-mail leri yazdırın
        List<WebElement> email = driver.findElements(By.xpath("//table[@class='smart-table table table-striped']//tbody//tr//td[7]"));
        email.stream().forEach(t-> System.out.println(t.getText()));

        //Tüm E-maillerin "@" işareti içerdiğini doğrulayin
        for (WebElement w : email ){
            Assert.assertTrue(w.getText().contains("@"));
        }
    }


}

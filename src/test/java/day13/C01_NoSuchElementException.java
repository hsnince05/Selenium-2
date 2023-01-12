package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {

    @Test
    public void noSuchElementTest(){
        /*
NoSuchElementException:
Yanlis locator
Popup, yeni pencere, iframe,…
Sayfa dolmada problemler ve yavaslamalar
Sakli olan elementler


COZUM : Solution:
Locatorin dogrulugunu tekrar kontrol et
Manual test ile iframe, yeni pencere, alert,… gibi elementlerin varligini kontrol et.
Bekleme problemi olabilir. Implicit wait bekleme suresini cozmuyor. Bu durumda explicit wait yada fluent wait kullaniriz

         */

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//input[@type=' searchhh ']")). //org.openqa.selenium.NoSuchElementException:
                sendKeys("QA", Keys.ENTER);


    }

}

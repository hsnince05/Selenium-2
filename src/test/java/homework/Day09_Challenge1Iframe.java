package homework;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Day09_Challenge1Iframe extends TestBase {

    @Test
    public void Iframe() throws InterruptedException {

        //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın
        driver.switchTo().frame("emoojis");
        driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();
        Thread.sleep(2000);

        // ikinci emoji altındaki tüm öğelere tıklayın
        List<WebElement>emojiler = driver.findElements(By.xpath("//*[@id ='nature']//div//img"));
        System.out.println(emojiler.size());

        for (WebElement w : emojiler){
            w.click();
        }

        // ana iframe'e geri dön
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        //formu doldurun,(Formu istediğiniz metinlerle doldurun)
        driver.findElement(By.xpath("//*[@id='text']")).sendKeys("Hello", Keys.TAB,"aaa",Keys.TAB,"bbb",Keys.TAB,"ccc",Keys.TAB,
                "ddd",Keys.TAB,"eee",Keys.TAB,"fff",Keys.TAB,"ggg",Keys.TAB,"hhh",Keys.TAB,"jjj",Keys.TAB,"dfsf");

        Thread.sleep(2000);


        // uygula butonuna tıklayın
        driver.findElement(By.id("send")).click();
        Thread.sleep(2000);


    }


}

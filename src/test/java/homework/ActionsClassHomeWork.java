package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ActionsClassHomeWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {



        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        // 2- Hover over Me First" kutusunun ustune
        Actions actions =new Actions(driver);
        WebElement lnk1 = driver.findElement(By.xpath("//button[.='Hover Over Me First!']"));
        actions.moveToElement(lnk1).perform();

        waitFor(3);


        //Link 1" e tiklayin
        driver.findElement(By.xpath("//a[.='Link 1']")).click();

        waitFor(3);



        //Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //Popup'i tamam diyerek
        driver.switchTo().alert().accept();

        //“Click and hold" kutusuna basili tutun
        WebElement clckAndHold= driver.findElement(By.id("click-box"));
        actions.clickAndHold(clckAndHold).perform();

        waitFor(3);

        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println("Click and hold button mesaji = " + clckAndHold.getText());
       // waitFor(3);

        //8- “Double click me" butonunu cift tiklayin
        WebElement doubleClick = driver.findElement(By.xpath("//h2"));
        actions.doubleClick(doubleClick).perform();

    }
}

package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class IframeOdev extends TestBase {

    @Test
    public void HandleIframe() throws InterruptedException {
        //  https://the-internet.herokuapp.com/iframe sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        // sayfadaki toplam iframe sayisini bulunuz
        List<WebElement> iframeSayisi = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframeSayisi.size() = " + iframeSayisi.size());

        //Sayfa Basligindaki "Editor" yazını icerdigini test edelim
        String baslik =driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(baslik.contains("Editor"));

        //paragraftaki yaziyi silelim
        driver.switchTo().frame(0);
        String icYazi =driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
        System.out.println("icYazi = " + icYazi);

        driver.findElement(By.xpath("//p[.='Your content goes here.']")).clear();

        Thread.sleep(3000);

        //sonrasinda paragrafta "iframein icindeyim" yazisini yazdiralim
        driver.findElement(By.xpath("//p")).sendKeys("iframein icindeyim");

        //Alt kisimdaki yazinin "Elemental Selenium" yazisini icerdigini test edelim.
        driver.switchTo().defaultContent();
        String disYazi = driver.findElement(By.xpath("//*[@style='text-align: center;']")).getText();
        Assert.assertTrue(disYazi.contains("Elemental Selenium"));

    }




}

package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Day05Challenge extends TestBase {
    /*
  ~ http://tutorialsninja.com/demo/index.php?route=common/home adresine gidin
  ~ Telefonlar ve PDA'lar üzerine tıklayın
  ~ telefonların markasını alın
  ~ tüm öğeler için ekle düğmesine tıklayın
  ~ siyah toplam eklenen sepet düğmesine tıklayın
  ~ listenin isimlerini sepetten al
  ~ görüntüleme listesinden ve alışveriş sepeti listesindeki adları karşılaştırın
   */
    @Test
    public void Test01() throws InterruptedException {
        //~ http://tutorialsninja.com/demo/index.php?route=common/home adresine gidin
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

        //    ~ Telefonlar ve PDA'lar üzerine tıklayın
        driver.findElement(By.xpath("//*[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=24']")).click();

        //    ~ telefonların markasını alın
        List<WebElement> TelephoneNames = driver.findElements(By.xpath("//h4"));
        List<String> list1 = new ArrayList<>();
        for (WebElement w : TelephoneNames) {
            list1.add(w.getText());
        }
        System.out.println(list1);

        //    ~ tüm öğeler için ekle düğmesine tıklayın
        List<WebElement> click = driver.findElements(By.xpath("//*[@class='button-group']"));
        for (WebElement w : click) {
            w.click();
        }

        //    ~ siyah toplam eklenen sepet düğmesine tıklayın
        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();


        //    ~ listenin isimlerini sepetten al
        List<WebElement> Telephones = driver.findElements(By.xpath("//*[@class='text-left']"));
        List<String> list2 = new ArrayList<>();
        for (WebElement w : Telephones) {
            list2.add(w.getText());
        }
        System.out.println(list2);

        //    ~ görüntüleme listesinden ve alışveriş sepeti listesindeki adları karşılaştırın

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.contains(list1.get(i)));
        }

    }
}

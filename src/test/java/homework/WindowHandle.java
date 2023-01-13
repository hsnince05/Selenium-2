package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class WindowHandle extends TestBase {


    @Test
    public void test01() {
        //Test01 :  1- amazon gidin
        driver.get("https://www.amazon.com");

        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement iframe = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

        Select select = new Select(iframe);
        List<WebElement> ddm = select.getOptions();
        ddm.stream().forEach(t -> System.out.println(t.getText()));

        System.out.println(ddm.size());
        //dropdown menude 40 eleman olduğunu doğrulayın
        Assert.assertFalse(ddm.size() == 40);
    }
        @Test
        public void test02(){
        //Test02
        //dropdown menuden elektronik bölümü seçin
            WebElement iframe = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

            Select select = new Select(iframe);
            select.selectByVisibleText("Electronics");

        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
            driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone");

        //sonuc sayisi bildiren yazinin iphone icerdigini test edin
            Assert.assertTrue(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).
                    getText().contains("iphone"));

        //ikinci ürüne relative locater kullanarak tıklayin
        WebElement birinciUrun=driver.findElement(By.xpath("//*[@data-asin='B0BG875KCH']"));
        WebElement ucuncuUrun=driver.findElement(By.xpath("//*[@data-asin='B0BP73DD5S']"));

        //driver.findElement()


        //ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
        //Test03
        //yeni bir sekme açarak amazon anasayfaya gidin
        //dropdown’dan bebek bölümüne secin
        //bebek puset aratıp bulundan sonuç sayısını yazdırın
        //sonuç yazsının puset içerdiğini test edin
        //5-üçüncü ürüne relative locater kullanarak tıklayin
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin  Test 4
        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
    }
}

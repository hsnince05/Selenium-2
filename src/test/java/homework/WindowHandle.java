package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class WindowHandle extends TestBase {

    @Test
    public void test01(){
        //Test01 :  1- amazon gidin
        driver.get("https://amazon.com");

        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement iframe= driver.findElement(By.xpath("//*[@id='nav-search-dropdown-card']"));

        Select select = new Select(iframe);
        List<WebElement>ddm = select.getOptions();
        System.out.println(ddm);

        //dropdown menude 40 eleman olduğunu doğrulayın
        //Test02
        //dropdown menuden elektronik bölümü seçin
        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        //sonuc sayisi bildiren yazinin iphone icerdigini test edin
        //ikinci ürüne relative locater kullanarak tıklayin
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

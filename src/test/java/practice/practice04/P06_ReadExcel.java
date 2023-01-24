package practice.practice04;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P06_ReadExcel extends TestBase {

   /*
    //<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
    //<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
    1-Onceliki olarak dependencyleri pom.xml'e yukluyoruz
    2-Dosya yolumuzu string bir degiskene atiyoruz
    3-ve bu dosyayi sistemde akişa aliyoruz
    */

    @Test
    public void name() throws IOException {
        String dosyaYolu = "C:\\Users\\Hasan İNCE\\Desktop\\data.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        //Bilgisayarınızdaki data isimli excel dosyasından kullanıcı bilgilerini alıp

        String email = workbook.getSheet("Sayfa1").getRow(1).getCell(1).toString();
        System.out.println(email);

        String password = workbook.getSheet("Sayfa1").getRow(2).getCell(1).toString();
        System.out.println(password);

        //https://www.bluerentalcars.com/ adresine gidip
        driver.get("https://www.bluerentalcars.com/");

        //Excel dosyasından aldığımız kullanıcı bilgileri ile login olalım
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.xpath("//*[@id='formBasicEmail']")).sendKeys(email, Keys.TAB,password,Keys.TAB,Keys.ENTER);

        //Login olduğumuzu doğrulayalım
        WebElement login = driver.findElement(By.xpath("//*[@id='dropdown-basic-button']"));
        assert login.getText().equals("Erol Evren");
    }

}

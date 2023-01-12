package homework;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;



public class OdevFaker extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        Faker faker = new Faker();
        //Faker Kutuphanesi HOMEWORK
        //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
        //degerler uretmemize imkan tanir.
        //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.

        String isim = faker.name().firstName();
        String soyisim = faker.name().username();
        String email = faker.internet().emailAddress();
        String sifre = faker.internet().password();
        int day = faker.number().numberBetween(1,31);
        int ay = faker.number().numberBetween(1,12);
        int yil = faker.number().numberBetween(1905,2023);
        String yil1= String.valueOf(yil);

        int cinsiyet = faker.number().numberBetween(1,3);


        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");

        //“create new account”  butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //“firstName” giris kutusuna bir isim yazin
        driver.findElement(By.name("firstname")).sendKeys(isim);

        //“surname” giris kutusuna bir soyisim yazin
        driver.findElement(By.name("lastname")).sendKeys(soyisim);

        //“email” giris kutusuna bir email yazin
        driver.findElement(By.name("reg_email__")).sendKeys(email);


        //“email” onay kutusuna emaili tekrar yazin
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);


        //Bir sifre girin
        driver.findElement(By.name("reg_passwd__")).sendKeys(sifre);



        //Tarih icin gun secin
        WebElement gun = driver.findElement(By.name("birthday_day"));
        Select select1 =new Select(gun);
        select1.selectByIndex(day);


        //Tarih icin ay secin
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select select2 =new Select(month);
        select2.selectByIndex(ay);

        //Tarih icin yil secin
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select select3 =new Select(year);
        select3.selectByVisibleText(yil1);

        //Cinsiyeti secin
        WebElement women = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement man = driver.findElement(By.xpath("//input[@value='2']"));
        man.click();
        WebElement diger = driver.findElement(By.xpath("//input[@value='-1']"));



        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        Assert.assertTrue(man.isSelected());
        Assert.assertFalse(women.isSelected());
        Assert.assertFalse(diger.isSelected());



        //Sayfayi kapatin
        Thread.sleep(5);

    }
}

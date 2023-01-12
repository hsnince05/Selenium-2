package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04Challenge {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. "https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");
    //2. Username kutusuna "standard_user" yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    //3. Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();

    //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement urun1 = driver.findElement(By.xpath("//*[@id ='item_4_title_link']"));
        String urunIsmi = urun1.getText();
        System.out.println(urunIsmi);
        urun1.click();

    //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

    //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//*[@class= 'shopping_cart_link']")).click();

    //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        String sepet = driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();
        if (urunIsmi.equals(sepet)){
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

    //9. Sayfayi kapatin
        driver.quit();


    }


}

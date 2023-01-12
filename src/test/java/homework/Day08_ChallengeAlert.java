package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day08_ChallengeAlert extends TestBase {
    @Test
    public void Alert() throws InterruptedException {

    get();
    clickButton();
    uyari1();
    click2();
    alertKapama();
    click3();
    alertsend();
    dogrula();
    }

    public void get() {
        // go to url :http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");
    }


    public void clickButton() throws InterruptedException {
    //    click  "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@href='#OKTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(3000);
    }

        //          accept Alert(I am an alert box!) and print alert on console
    public void uyari1() throws InterruptedException {
        String uyari = driver.switchTo().alert().getText();
        System.out.println(uyari);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    //         click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
    //        "Alert with OK & Cancel" butonuna tıklayın ve"click the button to display a confirm box " butonuna tıklayın
    public void click2(){
        driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }


    //         cancel Alert  (Press a Button !)
    //       Alert'ü kapatın
    public void alertKapama() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
    }

        //      click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        //      "Alert with Textbox" butonuna tıklayın ve "click the button to demonstrate the prompt box " butonuna tıklayın.

    public void click3(){
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    }

        //           and then sendKeys 'TechProEducation' (Please enter your name)
        //        Açılan alert e 'TechProEducation' (Lütfen İsminizi girin).
    public void alertsend() throws InterruptedException {
        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("Hasan INCE");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }

        //      Gönderdiğiniz metnin isminizi içerdiğini doğrulayın
        //        finally print on console this mesaaje "Hello TechproEducation How are you today"
    public void dogrula(){
        String text =driver.findElement(By.id("demo1")).getText();
        Assert.assertTrue(text.contains("Hasan"));
    }

}

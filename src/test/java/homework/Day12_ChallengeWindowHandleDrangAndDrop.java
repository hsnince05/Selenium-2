package homework;

import com.github.javafaker.Options;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;



public class Day12_ChallengeWindowHandleDrangAndDrop extends TestBase {



     /*
  #go to url : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
 #Fill in capitals by country
*/
  /*
   #url'ye gidin: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
  #Ülkeye göre başkentleri doldurun
 */

    @Test
    public void test01(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions=new Actions(driver);

        //roma-Italy
        WebElement romeKaynak= driver.findElement(By.xpath("//*[@id='box6']"));
        WebElement romeHedef= driver.findElement(By.xpath("//*[@id='box106']"));
        actions.dragAndDrop(romeKaynak,romeHedef).perform();

        //Madrid--Spain
        WebElement madridKaynak= driver.findElement(By.xpath("//*[@id='box7']"));
        WebElement madridHedef= driver.findElement(By.xpath("//*[@id='box107']"));
        actions.dragAndDrop(madridKaynak,madridHedef).perform();

        //Oslo--Norway
        WebElement osloKaynak= driver.findElement(By.xpath("//*[@id='box1']"));
        WebElement osloHedef= driver.findElement(By.xpath("//*[@id='box101']"));
        actions.dragAndDrop(osloKaynak,osloHedef).perform();

        //washington---United States
        WebElement wassKaynak= driver.findElement(By.xpath("//*[@id='box3']"));
        WebElement wassHedef= driver.findElement(By.xpath("//*[@id='box103']"));
        actions.dragAndDrop(wassKaynak,wassHedef).perform();

        //stockholm ---- Sweden
        WebElement stockKaynak= driver.findElement(By.xpath("//*[@id='box2']"));
        WebElement stockHedef= driver.findElement(By.xpath("//*[@id='box102']"));
        actions.dragAndDrop(stockKaynak,stockHedef).perform();

        //seoul -- sout Korea
        WebElement seoulKaynak= driver.findElement(By.xpath("//*[@id='box5']"));
        WebElement seoulHedef= driver.findElement(By.xpath("//*[@id='box105']"));
        actions.dragAndDrop(seoulKaynak,seoulHedef).perform();

//          // Copenhagen -- Denmark
        WebElement copenKaynak= driver.findElement(By.xpath("//*[@id='box4']"));
        WebElement copenHedef= driver.findElement(By.xpath("//*[@id='box104']"));
        actions.dragAndDrop(copenKaynak,copenHedef).perform();




    }


}

package students.mustafa;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class lab005 {
    //Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
    WebDriver driver;
    @AfterMethod
    public void setup(){
        System.out.println("before method is running");
        driver= WebDriverUtil.getDriver("chrome");
      //  driver.get("https://www.amazon.com");

    }
    @AfterMethod
    public void closing(){

    }
    @Test
    public void test1() throws InterruptedException {
        driver=WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("desk");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}

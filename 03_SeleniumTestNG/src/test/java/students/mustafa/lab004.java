package students.mustafa;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab004 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html




    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");

//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        Thread.sleep(5000);
        WebElement checkbox1=driver.findElement(By.id("vfb-6-0")); checkbox1.click();
        WebElement checkbox2=driver.findElement(By.id("vfb-6-1")); checkbox2.click();
        WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));checkbox3.click();
        boolean a1=checkbox1.isSelected();
        boolean a2=checkbox2.isSelected();
        boolean a3=checkbox3.isSelected();
        System.out.println(a1+"  "+a2+"  "+a3);


//4. Click to checkbox3
//5. Verify checkbox3 is selected

    }
}

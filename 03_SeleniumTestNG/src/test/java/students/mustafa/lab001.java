package students.mustafa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab001 {
    public static void main(String[] args) throws InterruptedException {

        //  Go to https://www.etsy.com/
        //Maximize window


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        ///##Task 2
        //  Go to https://www.amazon.com/
        //  get title and print out
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();

        Thread.sleep(2000);
    driver1.get("https://www.amazon.com/");
    String amazontitle=driver1.getTitle();

        System.out.println("amazontitle = " + amazontitle);





    }

        
}

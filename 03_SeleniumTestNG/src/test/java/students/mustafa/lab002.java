package students.mustafa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab002 {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("passed actualTitle = " + actualTitle+ " expectedtitle  "+ expectedTitle);
        } else {
            System.out.println("failed = ");
        }
        driver.close();
//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("http://www.google.com/");
        Thread.sleep(2000);
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().to("https://www.amazon.com");


        String titlecontaainssmile="Smile";
        String actualTitle1=driver1.getTitle();
        if (actualTitle1.contains(titlecontaainssmile)){
            System.out.println("amazon title contain is passed, smile");
        }else {
            System.out.println("not passed,failed ");
        }
        System.out.println("Actiual title is "+ actualTitle1);
        driver1.close();

     //   Second Task:
        // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesnt contains "Smile"
        // Verify Current Url
        // Go to https://www.amazon.com/
        // Verify title
        // Verify Current Url
        // Navigate Back
        // Refresh
        // Quit browser
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://www.etsy.com/");
        driver2.manage().window().maximize();
        String containSmile="Smile";
        String actualTitle2=driver2.getTitle();
        if (actualTitle2.contains(containSmile)){
            System.out.println("concate smile  = " + containSmile);
        }else {
            System.out.println("doesnt concate smile= " + actualTitle2);
        }
        String currenturl=driver2.getCurrentUrl();
        System.out.println("currenturl = " + currenturl);

        WebDriverManager.chromedriver().setup();
        WebDriver driver4=new ChromeDriver();

        driver4.get("https://www.amazon.com/");

        String actualtitle4=driver4.getTitle();
        System.out.println("actualtitle4 = " + actualtitle4);
        String currenturl4=driver2.getCurrentUrl();
        System.out.println("currenturl4 = " + currenturl4);

        driver4.navigate().back();
        driver4.navigate().refresh();
        driver4.quit();
        
        
    }
}

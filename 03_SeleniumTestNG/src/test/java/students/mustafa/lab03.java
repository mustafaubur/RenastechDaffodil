package students.mustafa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);
        WebElement searchButton=driver.findElement(By.name("btnK"));
        searchButton.click();



//5- Verify title:
// Expected: Title should start with "apple" word
       String expectedtitle="apple";
       String actualtitle=driver.getTitle();Thread.sleep(3000);
       if (actualtitle.startsWith(expectedtitle)){
           System.out.println("verification is passed. Actualtitle: " + actualtitle+"  expectedtitle:  "+expectedtitle);
       } else {
           System.out.println(" verification is failed");
       }


//6-navigate back
        driver.navigate().back();
//7-write cherry in search box
        driver.findElement(By.name("q")).sendKeys("cherry");
//8-verify title contains cherry.
          String expectedtitle1="cherry";
          String actualtitle1=driver.getTitle();
              if( actualtitle1.equalsIgnoreCase(expectedtitle1)){
                  System.out.println("actualtitle1 contains 'cherry' and its passed = " );
              } else {
                  System.out.println("its failed for cherry");
              }

//TASK2: Google Feeling lucky button
//1- Open a chrome browser

//2- Go to: https://google.com
                driver.get("https://www.google.com");
//3- Write "apple" in search box

                driver.findElement(By.name("q")).sendKeys("apple");

//click i am feeling lucky button
                  Thread.sleep(3000);
                 WebElement luckybutton=driver.findElement(By.name("btnI"));
                 luckybutton.click();
//Verify title contains Apple
        String exp="apple";
        String act=driver.getTitle();
        if (act.equalsIgnoreCase(exp)){
            System.out.println("contain apple , passed");
        }else {
            System.out.println("not passed");
        }

//go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
        driver.get("https://opensource-demo.orangehrmlive.com/");
       WebElement username=driver.findElement(By.id("txtUsername"));
       username.sendKeys("Admin");
        WebElement userpass=driver.findElement(By.id("txtPassword"));
        userpass.sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

    }
}

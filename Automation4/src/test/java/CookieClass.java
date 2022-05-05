import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


   import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

    public class CookieClass {

        //Go through the process of creating course"value
        //create course by title qa888
        //enter / select all other fields valid
        //press create course button
        @Test
        public void Cook() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
            driver.findElement(By.name("uname")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("Pass");
            String cookieName=driver.findElement(By.name("uname")).getAttribute("value");
            System.out.println(cookieName);


            driver.findElement(By.name("SUBMIT")).click();
            WebElement cookie=driver.findElement(By.linkText("Welcome: Administrator"));
            System.out.println(cookie);
            // Compare WebElement with String
            String cookie2=cookie.getText();
            System.out.println(cookie2);
            //Extract from Welcome:Administrator,
            String cookie3=cookie2.substring(9,14);
            System.out.println(cookie3);


            if (cookieName.equalsIgnoreCase(cookie3)){
                System.out.println("Test passed");
            }
            else {
                System.out.println("Test failed");
            }

           // loop





        }}

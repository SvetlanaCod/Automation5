import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassLocateElem {
//LAUNCH APP
    //AR USERNAME FIELD ENTER Admin
    //At password enter "pass
    //Click on Login button
    //Verify main screen is displayed
   @Test
    public void workLocate() {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver= new ChromeDriver();
        Driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        Driver.findElement(By.name("uname")).sendKeys("Admin");
        Driver.findElement(By.name("password")).sendKeys("Pass");
        Driver.findElement(By.name("SUBMIT")).click();
        System.out.println(Driver.getTitle());


        ///Go through the process of creating course by name of QA 5678
        /// Verify course page is displayed
       Driver.findElement(By.linkText("Schedule Courses")).click();
       Driver.findElement(By.linkText("Create New Course")).click();
       System.out.println(Driver.getTitle());


       Select Category=new Select(Driver.findElement(By.name("Cat")));
       Category.selectByValue("5");
       Category.selectByIndex(2);













    }
    }






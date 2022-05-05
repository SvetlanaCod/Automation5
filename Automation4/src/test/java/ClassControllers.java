import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.sql.Driver;

public class ClassControllers {
    @Test
    public void Practice(){
      WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        Driver.findElement (By.name("uname")).sendKeys("Admin");
        Driver.findElement(By.name("password")).sendKeys("Pass");
        Driver.findElement(By.name("SUBMIT")).click();
        System.out.println(Driver.getTitle());


        Driver.findElement(By.linkText("Schedule Courses")).click();
        Driver.findElement(By.linkText("Create New Course")).click();
        System.out.println(Driver.getTitle());

        Select category= new Select(Driver.findElement(By.name("Cat")));
        category.selectByValue("10");
        Driver.findElement(By.name("Title")).sendKeys("QA555");

        Select level= new Select(Driver.findElement(By.name("course_Level")));
        level.selectByIndex(2);
        Driver.findElement(By.name("Description")).sendKeys("QA course");

        Driver.findElement(By.name("Cert")).click();
        Driver.findElement(By.name("Submit")).click();








    }
}

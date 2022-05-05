import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScheduleCourse {
    @Test
    public void Schedule() {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        Driver.findElement(By.name("uname")).sendKeys("Admin");
        Driver.findElement(By.name("password")).sendKeys("pass");
        Driver.findElement(By.name("SUBMIT")).click();
        System.out.println(Driver.getTitle());

        Driver.findElement(By.linkText("Schedule Courses")).click();
        Driver.findElement(By.linkText("Schedule course")).click();
        System.out.println(Driver.getTitle());


    }


}

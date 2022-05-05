import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CookieLocateControllers {
    @Test
    public void HomeWork() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        driver.findElement(By.name("uname")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("pass");
        driver.findElement(By.name("SUBMIT")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Schedule Courses")).click();
        driver.findElement(By.linkText("Create New Course")).click();
        Select Category = new Select(driver.findElement(By.name("Cat")));
        Category.selectByIndex(13);

        driver.findElement(By.name("Title")).sendKeys("CookieLocateControllers");
        String Title = driver.findElement(By.name("Title")).getAttribute("values");
        System.out.println(Title);

        Select Level = new Select(driver.findElement(By.name("course_level")));
        Category.selectByIndex(3);
        driver.findElement(By.name("Description")).sendKeys("Description");
        // driver.findElement(By.name("Cert")).click();


    }

}


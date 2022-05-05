import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoopClassNew {

    //Go through the process of creating course"value
    //create course by title qa888
    //enter / select all other fields valid
    //press create course button
    @Test
    public void Loop() {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        Driver.findElement(By.name("uname")).sendKeys("Admin");
        Driver.findElement(By.name("password")).sendKeys("Pass");

        Driver.findElement(By.name("SUBMIT")).click();
        System.out.println(Driver.getTitle());


        Driver.findElement(By.linkText("Schedule Courses")).click();
        Driver.findElement(By.linkText("Create New Course")).click();
        System.out.println(Driver.getTitle());

        Select category = new Select(Driver.findElement(By.name("Cat")));

        // Loop
        for (WebElement loop : category.getOptions()) {
            System.out.println(loop);
        }
        for (WebElement i : category.getOptions()) {
            System.out.println(i.getText());
        }

        System.out.println(category.getOptions().size());
        Select level = new Select(Driver.findElement(By.name("course_Level")));
        for (WebElement loop : level.getOptions()) {
            System.out.println(loop.getText());
        }


    }
}


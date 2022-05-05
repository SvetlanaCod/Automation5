import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationCourseQA {

        //Go through the process of creating course
        //create course by title qa888
        //enter / select all other fields valid
        //press create course button
       @Test
        public void QAVarification() {

          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
          driver.findElement(By.name("uname")).sendKeys("Admin");
          driver.findElement(By.name("password")).sendKeys("Pass");
          driver.findElement(By.name("SUBMIT")).click();
          System.out.println(driver.getTitle());

          driver.findElement(By.linkText("Schedule Courses")).click();
          driver.findElement(By.linkText("Create New Course")).click();
          Select category = new Select(driver.findElement(By.name("Cat")));
          category.selectByIndex(13);

          driver.findElement(By.name("Title")).sendKeys("VeryInterestedProject");
          String Title = driver.findElement(By.name("Title")).getAttribute("value");
          System.out.println(Title);

          Select level = new Select(driver.findElement(By.name("course_Level")));
          level.selectByIndex(3);
          driver.findElement(By.name("Description")).sendKeys("Description");
          driver.findElement(By.name("Cert")).click();

          driver.findElement(By.name("Submit")).click();
          String Title1 = driver.findElement(By.name("Title")).getAttribute("value");
          System.out.println(Title1);
          driver.findElement(By.linkText("Automation Course7"));

          WebElement Title7 = driver.findElement(By.linkText("NewProject7"));
          System.out.println(Title7);
          String Title5 = Title7.getText();
          System.out.println(Title5);

          if (Title1.equalsIgnoreCase(Title5)) {
             System.out.println("Test passed");
          } else {
             System.out.println("Test failed");
          }


       }
}




import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven2 {

  @Test ( dataProvider = "driven2")
    public void DrivenHW (String title) {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
    driver.findElement(By.name("uname")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("pass");
    driver.findElement(By.name("SUBMIT")).click();
      System.out.println(driver.getTitle());

    driver.findElement(By.linkText("Schedule Courses")).click();
    driver.findElement(By.linkText("Create New Course")).click();
    System.out.println(driver.getTitle());
    Select category= new Select(driver.findElement(By.name("Cat")));
    category.selectByIndex(1);

    Select level= new Select(driver.findElement(By.name("course_Level")));
    level.selectByIndex(2);
    driver.findElement(By.name("Description")).sendKeys("QA course");
    driver.findElement(By.name("Cert")).click();

    driver.findElement(By.name("Title")).sendKeys(title);
    String enterTitle = driver.findElement(By.name("Title")).getAttribute("value");
    System.out.println(enterTitle);
    driver.findElement(By.name("Submit")).click();
    String checkTitle = driver.findElement(By.linkText(title)).getText();
    System.out.println(checkTitle);

    if (enterTitle.equalsIgnoreCase(checkTitle)) {
         System.out.println("Test passed");
         }   else {
         System.out.println("Test failed");
        }

  }
  @DataProvider (name = "driven2")
  public Object [] loginData () {
    Object[] data = new Object[2];
    data [0] = "12345";
    data [1] = "ADMIN";
    return data;
  }

}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalAssignmentDataDriven {
    @Test (dataProvider = "Data")
    public void negativeTestPass (String password) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        driver.findElement(By.name("uname")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("SUBMIT")).click();
        driver.findElement(By.linkText("Try again")).click();
        driver.close();
    }
    @DataProvider (name = "Data")
    public Object [] password () {
        Object [] pass = new Object[4];
        pass [0] = "123";
        pass [1] = "*&$";
        pass [2] = "passs";
        pass [3] = "";

        return pass;





    }
}

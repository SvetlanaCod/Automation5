import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
    @Test(dataProvider = "data")
    public void Driven(String username) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");
        driver.findElement(By.name("uname")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys("pass");
        driver.findElement(By.name("SUBMIT")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Try again")).click();
        driver.close();
    }

    @DataProvider(name = "data")

    public Object[] Driven1() {

        Object[] data = new Object[5];
        data[0] = "admina";
        data[1] = "#@%&*";
        data[2] = "";
        data[3] = "12345";
        data[4] = "admi";

        return data;

    }
}











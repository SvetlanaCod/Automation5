import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass2 {


    @Test
    public void MyWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.navigate().to("https://www.amazon.ca/");

        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();

        String newPage = "toys";
        String real = Driver.getTitle();
        System.out.println(real);

        if (newPage == real) {
            System.out.println("test case passed");
        } else {
            System.out.println("test failed");
        }
        String newURL = "www.toys";
        String real2 = Driver.getCurrentUrl();
        System.out.println(real2);
        if (newURL == real2) {
            System.out.println("test case passed");
        } else {
            System.out.println("test case failed");
        }
        Driver.close();

    }
}

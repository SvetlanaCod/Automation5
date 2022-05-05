import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumWorkInclass {

    @Test
    public void newClass() {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.imdb.com/");
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();
        String myPage = "movies";
        String actual = Driver.getTitle();
        System.out.println(actual);
        if (myPage == actual) {
            System.out.println("test case passed");
        } else {
            System.out.println("test failed");
        }
        String myURL = "www.movie";
        String actual2 = Driver.getCurrentUrl();
        System.out.println(actual2);
        if (myURL == actual2) {
            System.out.println("test case passed");
        } else {
            System.out.println("test case failed");
        }


    }
}







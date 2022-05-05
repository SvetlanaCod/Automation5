import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumWork {
    @Test
    public void secondClass() {
       WebDriverManager.chromedriver().setup();
       WebDriver Driver= new ChromeDriver();
       Driver.get("https://www.imdb.com/");
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();

       String title=Driver.getTitle();
       System.out.println(title.substring(0,4));
       if (title.substring(0,4).equals("IMDb")) {
           System.out.println("test passed");
       }
       else{
           System.out.println("test failed");
       }
        Driver.close();










    }


   }

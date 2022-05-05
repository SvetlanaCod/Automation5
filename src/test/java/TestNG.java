import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void testCas1(){
        System.out.println("a test");
}
    @BeforeClass
    public void beforeclass(){
        System.out.println("Beforclass method");}

    @AfterClass
    public void Afterclass(){
        System.out.println("Afterclass method");}







}


package definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver=null;
    @Before
    public static void open_Browser(){

        String chome= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";

        System.out.println(chome);
        System.setProperty("webdriver.chrome.driver",chome);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

@After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
}

}

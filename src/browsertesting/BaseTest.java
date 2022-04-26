package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openbrowser(String baseUrl){
        //Chrome option
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");//(disable browser notification)
        option.addArguments("--incognito");//open browser in private window.
        //option.addArguments("--headless");//open headless browser.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver(option);
        driver.get(baseUrl);// Launch the URL.
        driver.manage().window().maximize();// Maximise Window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// We give implicit time to driver
    }
    public void closebrowser(){
        driver.quit();
    }
}

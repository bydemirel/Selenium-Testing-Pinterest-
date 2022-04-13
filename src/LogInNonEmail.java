import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogInNonEmail {
    public static void main(String[] args) {

        String EXE_PATH =  "D:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",EXE_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http:www.pinterest.com");
        driver.manage().window().maximize();

        // login account with not email
        driver.findElement(By.cssSelector(".erh")).click();
        driver.findElement(By.id("email")).sendKeys("bariscan_demirel");
        driver.findElement(By.id("password")).sendKeys("16b25z14h36");
        driver.findElement(By.cssSelector(".red > div")).click();


    }
}

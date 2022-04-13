import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateBusinessAccountHugeAge {
    public static void main(String[] args) {

        String EXE_PATH =  "D:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",EXE_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http:www.pinterest.com");
        driver.manage().window().maximize();

        // weak huge age (Error)
        driver.findElement(By.cssSelector(".MF7")).click();
        driver.findElement(By.id("email")).sendKeys("26baris26@gmail.com");
        driver.findElement(By.id("password")).sendKeys("16b25z14h36");
        driver.findElement(By.id("age")).sendKeys("2500");
        driver.findElement(By.cssSelector(".erh")).click();


    }
}

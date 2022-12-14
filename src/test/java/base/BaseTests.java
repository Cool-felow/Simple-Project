package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTests {

    private WebDriver driver;
    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().setSize(new Dimension(414, 896));

        //login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add one item to the cart
        //driver.findElement(By.id("item_1_title_link"));
        driver.findElement(By.id("item_1_title_link")).click();

        //go to basket
        //driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        //Check out
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();

        //Enter personal info and continue
        driver.findElement(By.id("first-name")).sendKeys("Nonhlanhla");
        driver.findElement(By.id("last-name")).sendKeys("Motlhaka");
        driver.findElement(By.id("postal-code")).sendKeys("925 street");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        System.out.println(driver.getTitle());

    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    //Tear Down
    public void tearUp(){
        driver.close();
        //driver.quit();
    }
}
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class Main {

    private WebDriver driver;

    //set up
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    //go to swagLabs
    public void visitLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    //Login with provided credentials



    //verify login successful


    //Tear Down
    public void tearUp(){
        driver.close();
        driver.quit();
    }


}
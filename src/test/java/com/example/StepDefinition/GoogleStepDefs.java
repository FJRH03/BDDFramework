package com.example.StepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDefs {

    @Given("^Launch Google Home Page$")
    public void launchGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Google"));
        driver.close();
        driver.quit();
    }
}

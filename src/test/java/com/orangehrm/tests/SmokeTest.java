package com.orangehrm.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest {
    private WebDriver driver;

    @Test
    void canOpenLoginPage() {
        driver = new ChromeDriver(); 
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title = driver.getTitle();
        assertTrue(title.toLowerCase().contains("orangehrm"),
                "Title should contain 'OrangeHRM' but was: " + title);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) driver.quit();
    }
}

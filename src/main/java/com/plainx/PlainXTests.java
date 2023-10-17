package com.plainx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class PlainXTests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://staging.plainx.com/");
        // need to give a break of 2 seconds before th elements become interactable
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("credentials_btn")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(System.getenv("Plainx_tests_email"));
        driver.findElement(By.id("password")).sendKeys(System.getenv("Plainx_passwords"));
        driver.findElement(By.id("login_btn")).click();

        driver.quit();

    }
}

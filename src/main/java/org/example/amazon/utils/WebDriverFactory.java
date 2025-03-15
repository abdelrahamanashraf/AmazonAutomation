package org.example.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    public static WebDriver createWebDriver(String browser) {
        WebDriver driver;
        ChromeOptions chromeOptions;
        System.setProperty("webdriver.chrome.driver",("D:\\Amazon_Automation"));
            driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }}
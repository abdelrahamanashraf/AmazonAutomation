package org.example.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys(username);
    }
    public void clickContinue() {
        WebElement continueButton = driver.findElement(By.id("submit"));
        continueButton.click();
    }


    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
    }
}
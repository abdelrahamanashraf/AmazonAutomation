package org.example.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickSignIn() {
        WebElement SignInButton = driver.findElement(By.id("signInSubmit"));
        SignInButton.click();
    }

    public void openAllMenu() {
        WebElement AllMenuButton = driver.findElement(By.id("nav-hamburger-menu"));
        AllMenuButton.click();
    }
    public void clickVideoGames() {
        WebElement VideoGamesButton = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[11]/a"));
        VideoGamesButton.click();
    }







}



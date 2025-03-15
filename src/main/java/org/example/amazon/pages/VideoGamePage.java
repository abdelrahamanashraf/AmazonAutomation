package org.example.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoGamePage {

    private WebDriver driver;

    public VideoGamePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAllVideoGames() {
        WebElement AllVideoGamesButton = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[16]/li[3]/a"));
        AllVideoGamesButton.click();
    }


}
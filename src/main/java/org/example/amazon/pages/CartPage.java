package org.example.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }



    public void proceedToCheckout() {
        WebElement proceedToCheckoutButton = driver.findElement(By.id("nav-cart"));
        proceedToCheckoutButton.click();
    }
    public void proceedToBuy() {
        WebElement proceedToBuyButton = driver.findElement(By.id("proceed-to-checkout-action"));
        proceedToBuyButton.click();
    }


}
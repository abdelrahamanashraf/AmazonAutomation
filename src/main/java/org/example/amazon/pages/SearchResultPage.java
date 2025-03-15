package org.example.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyFreeShippingFilter () {
        WebElement FreeShippingFilter = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div[1]/label/i"));
        FreeShippingFilter.click();
    }

    public void applyNewConditionFilter () {
        WebElement NewConditionFilter = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[1]/span/a/span"));
        NewConditionFilter.click();
    }


    public void sortByPriceHighToLow () {
        WebElement sortByPriceHighToLowButton = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[7]/ul/li[7]/span/a/span"));
        sortByPriceHighToLowButton.click();
    }

    public void addProductsBelowPriceToCart () {
        WebElement addProductsBelowPriceToCartButton = driver.findElement(By.id("a-autoid-1-announce"));
        addProductsBelowPriceToCartButton.click();
    }
    public void addProductsBelowPriceToCartTwo () {
        WebElement addProductsBelowPriceToCartTwoButton = driver.findElement(By.id("a-autoid-2-announce"));
        addProductsBelowPriceToCartTwoButton.click();
    }
}
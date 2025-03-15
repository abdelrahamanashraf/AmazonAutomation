package org.example.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addAddress() {
        WebElement addAddressButton = driver.findElement(By.id("checkout-change-shipaddressselect"));
        addAddressButton.click();
    }


    public void selectAddress() {
        WebElement selectAddressButton = driver.findElement(By.xpath("//*[@id=\"select-destination-on-sasp-desktop-panel-id-6HQHELWDXNMFU37ZXASMG12LQ6158SMH2A172HMS8516QLHPXTQ2EIA2OXB74CYR\"]/div/label/i"));
        selectAddressButton.click();
    }
    public void ClickDeliverAddress() {
        WebElement kDeliverAddressButton = driver.findElement(By.id("checkout-primary-continue-shipaddressselect"));
        kDeliverAddressButton.click();
    }

    public void changePayment() {
        WebElement changePaymentButton = driver.findElement(By.id("checkout-change-payselect"));
        changePaymentButton.click();


    }

    public void chooseCashPayment() {
        WebElement chooseCashPaymentButton = driver.findElement(By.id("pp-YHTCgF-110"));
        chooseCashPaymentButton.click();
    }


    public void clickPaymentMethod() {
        WebElement clickPaymentMethodButton = driver.findElement(By.id("checkout-primary-continue-payselect"));
        clickPaymentMethodButton.click();
    }

    public void verifyTotalAmount() {

        WebElement totalAmountElement = driver.findElement(By.id("orderSummaryPrimaryDisplayValue"));
        String totalAmountText = totalAmountElement.getText();

        String cleanedTotalAmount = totalAmountText.replaceAll("[^\\d.]+", "");

        try {
            double actualTotalAmount = Double.parseDouble(cleanedTotalAmount);


            // Assertion to verify the amounts
            Assert.assertEquals(actualTotalAmount , "Total amount mismatch");
            System.out.println("Total amount verified: Actual = " + actualTotalAmount );

        } catch (NumberFormatException e) {
            Assert.fail("Failed to parse total amount: " + totalAmountText);
        }

    }
}
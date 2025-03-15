# Amazon Egypt Video Game Purchase Test Automation

This project automates the purchase of video games on Amazon Egypt (amazon.eg) using Selenium WebDriver, Java 16, TestNG, and Maven.

## Prerequisites

* Java 16 or later
* Maven
* A web browser Chrome


# Page Object Model (POM)

The project follows the Page Object Model (POM) design pattern, which improves code maintainability and reusability. Each page of the Amazon website is represented by a separate Java class.

## Test Scenario

The `VideoGamePurchaseTest` class automates the following steps:

1.  Opens Amazon Egypt and logs in.
2.  Navigates to the "Video Games" category.
3.  Applies filters for "Free Shipping" and "New" condition.
4.  Sorts the results by price (high to low).
5.  Adds video games with prices below 15,000 EGP to the cart.
6.  Proceeds to checkout.
7.  Adds an address and chooses cash payment.
8.  Verifies the total amount.


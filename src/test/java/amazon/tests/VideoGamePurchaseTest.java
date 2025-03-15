package amazon.tests;

import org.example.amazon.pages.*;
import org.example.amazon.utils.ConfigReader;
import org.example.amazon.utils.WebDriverFactory;
import org.example.amazon.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VideoGamePurchaseTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private VideoGamePage videoGamesPage;
    private SearchResultPage searchResultsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createWebDriver("chrome");
        driver.get(ConfigReader.getProperty("url"));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        videoGamesPage = new VideoGamePage(driver);
        searchResultsPage = new SearchResultPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void purchaseVideoGames() {
        // 1. Login
        homePage.clickSignIn();
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.clickContinue();
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickSignInButton();

        // 2. Open "All" menu and navigate to Video Games
        homePage.openAllMenu();
        homePage.clickVideoGames();
        videoGamesPage.clickAllVideoGames();

        // 3. Apply filters
        searchResultsPage.applyFreeShippingFilter();
        searchResultsPage.applyNewConditionFilter();

        // 4. Sort by price high to low
        searchResultsPage.sortByPriceHighToLow();

        // 5. Add products below 15k EGP to cart
        searchResultsPage.addProductsBelowPriceToCart();
        searchResultsPage.addProductsBelowPriceToCartTwo();


        // 6. Proceed to checkout
        cartPage.proceedToCheckout();
        cartPage.proceedToBuy();

        // 7. Add address and choose cash payment
        checkoutPage.addAddress();
        checkoutPage.selectAddress();
        checkoutPage.ClickDeliverAddress();
        checkoutPage.changePayment();

        checkoutPage.chooseCashPayment();
        checkoutPage.clickPaymentMethod();



        // 8. Verify total amount
        checkoutPage.verifyTotalAmount();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
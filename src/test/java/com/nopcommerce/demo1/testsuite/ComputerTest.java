package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.Computer;
import com.nopcommerce.demo1.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ComputerTest extends BaseTest {
    Computer computer = new Computer();

    @Test
    // Verifying that Products are arranged Alphabetically
    public void verifyProductsAreArrangedAlphabetically() throws InterruptedException {
        computer.clickOnComputers(); // Clicking on the "Computers"
        computer.clickOnDesktop(); // Clicking on the "Desktop"
        computer.selectSortingOrderZToA(); // Selecting "Name: Z To A"
        // Storing the ACTUAL Visible text value into "visibleText"
        String visibleText = getTextFromElement(By.xpath("//select[@id='products-orderby']/option[text()='Name: Z to A']"));
        String expectedText = "Name: Z to A"; // Expected Message
        // Comparing the Messages
        assertEquals(visibleText, expectedText, "Products Not Sorted By Name: Z To A");
    }

    @Test
    // Verifying that Selected Products are added to Shopping Cart as Desired
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computer.clickOnComputers(); // Clicking on the "Computers"
        computer.clickOnDesktop(); // Clicking on the "Desktop"
        computer.selectSortingOrderAToZ(); // Selecting "Name: A To Z"
        computer.clickOnBuildYourOwnComputer(); // Clicking on the "Build your own computer"
        // Storing "Build your own computer" text
        String expectedCartText = "Build your own computer";
        // Storing the Actual "Build your own computer" text element
        String actualCartText = getTextFromElement(By.xpath("//h1[normalize-space()='Build your own computer']"));
        assertEquals(expectedCartText, actualCartText, "Not Build your own computer Text");
        computer.clickOnIntelPentiumDCE220(); // Selecting the Desired Processor option
        computer.select8GBOption(); // Selecting the Desired RAM
        computer.select400GBOption(); // Selecting the Desired HDD
        computer.selectVistaOption(); // Selecting the Desired Vista option
        computer.selectSWOptions(); // Selecting the MS Office option
        String expectedPrice = "$1,475.00";
        Thread.sleep(1000);
        // Getting the actual price
        String actualPrice = getTextFromElement(By.xpath("//span[@id='price-value-1']"));
        //Verifying the price "$1,475.00"
        Thread.sleep(1000);
        //Assert.assertEquals(expectedPrice, actualPrice);// "Price Not Matched To $1,475.00 As Desired");
        //Assert.assertEquals("$1,475.00", actualPrice,"Price Not Matched To $1,475.00 As Desired");
        //Assert.assertEquals(actualPrice, expectedPrice);
        Assert.assertEquals(actualPrice, expectedPrice, "Not Valid Match");
        computer.clickOnAddToCartButton(); // Clicking on the "ADD TO CART" button
        // Storing the expected message
        String expectedMessage = "The product has been added to your shopping cart";
        // Getting the actual message
        String actualMessage = getTextFromElement(By.xpath("//div[@class='bar-notification success']/p"));
        //Verifying the Message "The product has been added to your shopping cart" on Top green Bar
        assertEquals("Not added successfully", expectedMessage, actualMessage);
        computer.closingTheGreenBar(); // Closing the Green message bar
        computer.performMouseHoverOnShoppingCart(); // Mouse Hovering on Shopping Cart
        computer.clickOnAddToCartButton(); // Clicking on the "GO TO CART" button
        // Storing the expected message
        String expectedTextShoppingCart = "Shopping cart";

        // Getting the actual message
        String actualTextShoppingCart = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        //Verify the message "Shopping cart"
        assertEquals("Not On Shopping Cart", expectedTextShoppingCart, actualTextShoppingCart);
        String expectedTextShoppingCartEnd = "Shopping cart";
        //get actual
        String actualTextShoppingCartEnd = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        //Verify the message "Shopping cart"
        assertEquals(expectedTextShoppingCartEnd, actualTextShoppingCartEnd, "Not On Shopping Cart");
        computer.updateTheProductQuantity(); // Updating the products quantity to 2
        computer.clickOnUpdateShoppingCart(); // Clicking on the "Update Shopping Cart"
        String expectedTotal = "$2,950.00";
        String actualTotal = getAttValueFromElement(By.xpath("//td[@class='subtotal']/span[text()='$2,950.00']"));
        assertEquals(expectedTotal, actualTotal, "Invalid Total");
        computer.clickOnTheTermsOfService(); // Clicking on the Terms and service box
        computer.clickOnTheCheckOut(); // Clicking on the Checkout
        String expectedWelcome = "Welcome, Please Sign In!";
        String actualWelcome = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        assertEquals(expectedWelcome, actualWelcome, "Not On Sign In Page");
        computer.clickOnTheCheckOutAsGuest(); // Clicking on the checkout as a guest
        computer.fillUpMandatoryFields(); // Filling up user details
        computer.clickOnTheContinueButton(); // Clicking on the continue button
        computer.clickOnTheNextDayAirRadioButton(); // Clicking on the Next Day Radio Button
        computer.clickingOnTheContinue(); // Clicking on the continue
        computer.selectingTheCreditCardRadioButton(); // Selecting the Credit Card radio button
        computer.clickingOnContinueAfterCreditCard(); // Clicking on continue
        computer.selectingMasterCardOption(); // Selecting Master card option
        computer.fillingUpCreditCardDetails(); // Filling up credit card details
        computer.clickingOnContinueAfterFillingUpCreditCardDetails(); // Clicking on continue
        String expectedPaymentMethodText = "Credit Card";
        String actualPaymentMethodText = getTextFromElement(By.xpath("//li[@class='payment-method']/span[@class='value']"));
        Assert.assertEquals(actualPaymentMethodText, expectedPaymentMethodText, "Payment Method Not Verified");
        String expectedShippingText = "Next Day Air";
        String actualShippingText = getTextFromElement(By.xpath("//li[@class='shipping-method']/span[@class='value']"));
        Assert.assertEquals(actualShippingText, expectedShippingText, "Invalid Shipping Method");
        String expectedTotalAmount = "$2,950.00";
        String actualTotalAmount = getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        Assert.assertEquals(actualTotalAmount, expectedTotalAmount, "Total Amount Not Matched");
        computer.clickingOnTheConfirmButton(); // Clicking on the confirm button
        String expectedThankYouText = "Thank you";
        String actualThankYouText = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(actualThankYouText, expectedThankYouText, "Acknowledge Text Not Matched");
        String expectedSuccessfullyProcessed = "Your order has been successfully processed!";
        String actualSuccessfullyProcessed = getTextFromElement(By.xpath("//div[@class='section order-completed']/div[@class='title']/strong"));
        Assert.assertEquals(actualSuccessfullyProcessed, expectedSuccessfullyProcessed, "Confirmation Text Not Matched");
        computer.clickingOnContinueAfterCompletion(); // Clicking on continue
        String expectedWelcomeMessage = "Welcome to our store";
        String actualWelcomeMessage = getTextFromElement(By.xpath("//div[@class='topic-block-title']/h2"));
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage,"Welcome Text Not Matched");
    }
}

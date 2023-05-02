package com.nopcommerce.demo1.pages;

import com.nopcommerce.demo1.utilities.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {
    // Storing "Computers" link x-path into "computers" WebElement
    By computers = By.xpath("//ul[@class='top-menu notmobile']/li/a[text()='Computers ']");
    // Storing "Desktop" link x-path into "desktop" WebElement
    By desktop = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    // Storing The Visible text element into "visibleTextElement" WebElement
    By visibleTextElement = By.xpath("//select[@id='products-orderby']");
    // Storing the "Name: Z To A" element into "sortingOrderZToA" WebElement
    By sortingOrderZToA = By.xpath("//select[@id='products-orderby']/option[text()='Name: Z to A']");
    // Storing the "Name: A To Z" element into "sortingOrderAToZ" WebElement
    By sortingOrderAToZ = By.xpath("//select[@id='products-orderby']/option[text()='Name: A to Z']");
    // Storing "Build your own computer" element into "buildYourOwnComputer" WebElement
    By buildYourOwnComputer = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a");
    // Storing the Desired product's configuration into addingIntelPentiumDCE220 WebElement
    By addingIntelPentiumDCE220 = By.xpath("//select[@name='product_attribute_1']");
    // Storing "8Gb[=$60.00]" element into "ramOption" WebElement
    By ramOption = By.xpath("//select[@name='product_attribute_2']");
    // Storing "400Gb[+$100.00]" element into "hardDriveOption" WebElement
    By hardDriveOption = By.xpath("//input[@id='product_attribute_3_7']");
    // Storing "Vista Premium [+$60.00]" into "vistaOption" WebElement
    By vistaOption = By.xpath("//label[text()='Vista Premium [+$60.00]']");

    public void clickOnComputers() { // Clicking on the "Computers" Menu
        clickOnTheElement(computers);
    }

    public void clickOnDesktop() { // Clicking on the "Desktop" Sub Menu
        clickOnTheElement(desktop);
    }

    public void selectSortingOrderZToA() { // Clicking on the "Name: Z To A" option
        clickOnTheElement(sortingOrderZToA);
    }

    public void selectSortingOrderAToZ() { // Clicking on the "Name: A To Z" option
        clickOnTheElement(sortingOrderAToZ);
    }

    // Clicking on the "Build your own computer" link
    public void clickOnBuildYourOwnComputer() throws InterruptedException {
        Thread.sleep(1000);
        clickOnTheElement(buildYourOwnComputer);
    }

    // selecting the Desired processor configuration
    public void clickOnIntelPentiumDCE220() {
        selectByVisibleTextFromDropDown(addingIntelPentiumDCE220, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    // Selecting the RAM option
    public void select8GBOption() {
        selectByVisibleTextFromDropDown(ramOption, "8GB [+$60.00]");
    }

    // Selecting the Desired Hard Drive option
    public void select400GBOption() {
        clickOnTheElement(hardDriveOption);
    }

    // Selecting the "Vista Premium" option
    public void selectVistaOption() {
        clickOnTheElement(vistaOption);
    }

    // Storing MS Office element into "mSOfficeOption" WebElement
    By mSOfficeOption = By.xpath("//input[@id='product_attribute_5_12']");

    // Selecting the Desired Software options
    public void selectSWOptions() {
        clickOnTheElement(mSOfficeOption);
        //  clickOnTheElement(totalCommanderOption);
    }

    // Storing the "ADD TO CART" element to "addToCartButton" WebElement
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");

    // Clicking on the "ADD TO CART" button
    public void clickOnAddToCartButton() {
        clickOnTheElement(addToCartButton);
    }

    // Storing the 'x' clickable value into "clickOnX"
    By clickOnX = By.xpath("//div[@class='bar-notification success']/span");

    // Closing the Green bar
    public void closingTheGreenBar() {
        clickOnTheElement(clickOnX);
    }

    // Storing the Mouse hover element into "mouseHoverOnShoppingCart" WebElement
    By mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");

    // Performing the mouse hover on Shopping Cart
    public void performMouseHoverOnShoppingCart() throws InterruptedException {
        mouseHoverOnElement(mouseHoverOnShoppingCart);
    }

    // Storing "GO TO CART" element into "goToCartButton" WebElement
    By goToCartButton = By.xpath("//button[@class='button-1 cart-button']");

    // Clicking on the "GO TO CART" button
    public void clickOnGoToCartButton() {
        clickOnTheElement(goToCartButton);
    }

    By updateQuantity = By.xpath("//input[@class='qty-input']");

    public void updateTheProductQuantity() {
        clickOnTheElement(updateQuantity);
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(updateQuantity, "2");
    }

    By clickOnUpdateCart = By.xpath("//button[@class='button-2 update-cart-button']");

    public void clickOnUpdateShoppingCart() {
        clickOnTheElement(clickOnUpdateCart);
    }

    By clickOnTermsOfService = By.xpath("//input[@name='termsofservice']");

    public void clickOnTheTermsOfService() {
        clickOnTheElement(clickOnTermsOfService);
    }

    By clickOnCheckOut = By.xpath("//button[@name='checkout']");

    public void clickOnTheCheckOut() {
        clickOnTheElement(clickOnCheckOut);
    }

    By clickCheckOutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    public void clickOnTheCheckOutAsGuest() {
        clickOnTheElement(clickCheckOutAsGuest);
    }

    // Declaring all the Mandatory elements
    By firstNameElement = By.id("BillingNewAddress_FirstName");
    By lastNameElement = By.id("BillingNewAddress_LastName");
    By emailElement = By.id("BillingNewAddress_Email");
    By countryElement = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By addressCityElement = By.id("BillingNewAddress_City");
    By addressLineElement = By.id("BillingNewAddress_Address1");
    By postCodeElement = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberElement = By.id("BillingNewAddress_PhoneNumber");

    public void fillUpMandatoryFields() {
        sendTextToElement(firstNameElement, "Roopen");
        sendTextToElement(lastNameElement, "Patel");
        sendTextToElement(emailElement, "rockpopone@rediffmail.com");
        sendTextToElement(countryElement, "UK");
        sendTextToElement(addressCityElement, "My Town");
        sendTextToElement(addressLineElement, "108 My Road");
        sendTextToElement(postCodeElement, "CR76DP");
        sendTextToElement(phoneNumberElement, "0123456789");
    }

    By clickOnContinueButton = By.xpath("//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']");

    public void clickOnTheContinueButton() {
        clickOnTheElement(clickOnContinueButton);
    }

    By clickOnRadioAir = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");

    public void clickOnTheNextDayAirRadioButton() {
        clickOnTheElement(clickOnRadioAir);
    }

    By clickingOnContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickingOnTheContinue() {
        clickOnTheElement(clickingOnContinue);
    }

    By selectCreditCardRadio = By.xpath("//input[@id='paymentmethod_1']");

    public void selectingTheCreditCardRadioButton() {
        clickOnTheElement(selectCreditCardRadio);
    }

    By clickOnContinueAfterCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickingOnContinueAfterCreditCard() {
        clickOnTheElement(clickOnContinueAfterCreditCard);
    }

    By selectMasterCard = By.xpath("//select[@id='CreditCardType']");

    public void selectingMasterCardOption() {
        selectByVisibleTextFromDropDown(selectMasterCard, "Master card");
    }

    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By securityCode = By.xpath("//input[@id='CardCode']");

    public void fillingUpCreditCardDetails() {
        sendTextToElement(cardHolderName, "MR JAMES BOND");
        sendTextToElement(cardNumber, "1234 5678 9123 4567");
        selectByVisibleTextFromDropDown(expiryMonth, "01");
        selectByVisibleTextFromDropDown(expiryYear, "2025");
        sendTextToElement(securityCode, "123");
    }
    By clickOnContinueAfterDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public void clickingOnContinueAfterFillingUpCreditCardDetails(){
        clickOnTheElement(clickOnContinueAfterDetails);
    }
    By clickOnConfirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void clickingOnTheConfirmButton(){
        clickOnTheElement(clickOnConfirm);
    }
    By clickOnContinueAfterCompletion = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public void clickingOnContinueAfterCompletion(){
        clickOnTheElement(clickOnContinueAfterCompletion);
    }
}

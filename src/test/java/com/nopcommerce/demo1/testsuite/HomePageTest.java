package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.HomePage;
import com.nopcommerce.demo1.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage(); // Creating the HomePage Object

    @Test
    // Verifying that All Top Menus are Clicking and displaying sub options as required
    public void userCanNavigateToPage() {
        homePage.selectMenu("Computers"); // Checking the "Computers" Menu
        homePage.selectMenu("Electronics"); // Checking the "Electronics" Menu
        homePage.selectMenu("Apparel"); // Checking the "Apparel" Menu
        homePage.selectMenu("Digital downloads"); // Checking the "Digital Downloads" Menu
        homePage.selectMenu("Books"); // Checking the "Books" Menu
        homePage.selectMenu("Jewelry"); // Checking the "Jewelry" Menu
        homePage.selectMenu("Gift Cards"); // Checking the "Gift Cards" Menu

    }
}



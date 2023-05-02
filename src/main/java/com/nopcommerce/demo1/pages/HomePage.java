package com.nopcommerce.demo1.pages;

import com.nopcommerce.demo1.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    // Creating the parameterised method to Click on the Top Menu by accepting the "menu" value
    public void selectMenu(String menu) {
        clickOnTheElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'" + menu + "')]"));
    }

    // Storing all Top Menus into List
    public void verifyPageNavigation() {
        List<String> topMenus = new ArrayList<String>(); // List Declaration
        topMenus.add("Computers"); // Adding values to List
        topMenus.add("Electronics");
        topMenus.add("Apparel");
        topMenus.add("Digital downloads");
        topMenus.add("Books");
        topMenus.add("Jewelry");
        topMenus.add("Gift Cards");

        // Iterating values from List "topMenus" and storing them into "topMenu" to supply them in the method
        for (String topMenu : topMenus) {
            selectMenu(topMenu);
            String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'" + topMenu + "')]"));
            Assert.assertEquals("Menu Not Found", topMenu, actualMessage);
        }

    }
}
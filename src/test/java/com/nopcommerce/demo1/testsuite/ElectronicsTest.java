package com.nopcommerce.demo1.testsuite;

import com.nopcommerce.demo1.pages.Electronics;
import com.nopcommerce.demo1.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    Electronics electronics = new Electronics(); // Creating object of ElectronicsTest class

    @Test
    public void electronicsTestFunctionalities() throws InterruptedException {
        electronics.mouseHoveringOnElectronics();  // Mouse hovering on electronics
        electronics.clickingOnCellPhones(); // Clicking on the cell phones
        String expectedCellPhoneText = "Cell phones";
        String actualCellPhoneText = getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']"));
        Assert.assertEquals(actualCellPhoneText,expectedCellPhoneText,"Cell Phones Text Not Matched");
    }
}

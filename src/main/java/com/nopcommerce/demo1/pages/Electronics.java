package com.nopcommerce.demo1.pages;

import com.nopcommerce.demo1.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    // Mouse hovering on Electronics
    By mouseHoverOnElectronics = By.xpath("//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']");

    public void mouseHoveringOnElectronics() throws InterruptedException {
        mouseHoverOnElement(mouseHoverOnElectronics);
    }

    // Clicking on Cell Phones
    By clickOnCellPhones = By.xpath("//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']");

    public void clickingOnCellPhones() {
        clickOnTheElement(clickOnCellPhones);
    }


}

package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class _012DynamicControls extends Base {

    @Test(description = "Dynamic Controls")
    public void dynamicControls() {
        // Navigate to URL
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        // click on remove
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        // wait to disappare loader
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@id=\"loading\" and contains(text(),'Wait for it...')])[1]")));
        // validate "It's gone!"
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\" and contains(text(),'s gone!')]"))).getText();
        Assert.assertEquals(text,"It's gone!");
        // click on add
        driver.findElement(By.xpath("//button[@onclick=\"swapCheckbox()\" and contains(text(),'Add')]")).click();
        // wait to disappare loader
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@id=\"loading\" and text()='Wait for it... '])[1]")));
        //validate "It's back!"
        String textBack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\" and  contains(text(),'s back!')]"))).getText();
        Assert.assertEquals(textBack,"It's back!");
    }

    @Test(description = "Dynamic Controls Enable/Disable")
    public void dynamicControlsEnableDisable() {
        // Navigate to Url
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        // Click on enable btn
        driver.findElement(By.xpath("//button[@onclick=\"swapInput()\"]")).click();
        // wait for loader to disappare
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@id=\"loading\" and contains(text(),'Wait for it... ')])")));
        // validate "It's enabled!"
        String textItsEnabled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'s enabled!')]"))).getText();
        Assert.assertEquals(textItsEnabled,"It's enabled!");
        // sendkey to textbox nitin
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nitin");
        // click on Disable btn
        driver.findElement(By.xpath("//button[@onclick=\"swapInput()\" and contains(text(),'Disable')]")).click();
        // wait for loader to disappare
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@id=\"loading\" and contains(text(),'Wait for it... ')])")));
        // validate "It's disabled!"
        String textItsDisabled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'s disabled!')]"))).getText();
        Assert.assertEquals(textItsDisabled,"It's disabled!");
        // validate text box is disabled.
    }

}

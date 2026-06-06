package org.example;

import base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class _007ContextMenu extends Base{

    @Test
    public void contextMenu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        Thread.sleep(10000);
        WebElement webElement =  driver.findElement(By.id("hot-spot"));
        actions.contextClick(webElement).perform(); // Right Click
        Thread.sleep(10000);
        driver.switchTo().alert().accept();
        Thread.sleep(10000);

    }


}

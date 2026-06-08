package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class _018WindowHandle extends Base {

    @Test(description = "Window Handle")
    public void windowHandle() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/");
        String window = driver.getWindowHandle();
        int currentCount = driver.getWindowHandles().size();
        Actions actions = new Actions(driver);
                actions
                .keyDown(Keys.COMMAND)
                .click(driver.findElement(By.xpath("//a[@href=\"/checkboxes\"]")))
                .keyUp(Keys.COMMAND)
                .perform();
                Thread.sleep(15000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d->d.getWindowHandles().size() > currentCount);
        Thread.sleep(15000);
        for (String w : driver.getWindowHandles()){
            if(!w.equals(window)){
                driver.switchTo().window(w);
                break;
            }
        }
        Thread.sleep(15000);

    }

}

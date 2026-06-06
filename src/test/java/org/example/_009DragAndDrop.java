package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _009DragAndDrop extends Base {

    @Test(description = "Drag and Drop")
    public void dragAndDropFeature() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement sourceA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"column-a\"]")));
        String headerNameBefore = sourceA.findElement(By.tagName("header")).getText();
        System.out.println("Source Before "+ headerNameBefore);
        WebElement destinationB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"column-b\"]")));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceA,destinationB).perform();
        sourceA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"column-a\"]")));
        String headerNameAfter = sourceA.findElement(By.tagName("header")).getText();
        System.out.println("Source After "+ headerNameAfter);
        Assert.assertNotEquals(headerNameBefore,headerNameAfter,"Not position got change");
        
    }

}

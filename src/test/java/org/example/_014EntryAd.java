package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _014EntryAd extends Base {

    @Test(description = "EntryAd")
    public void entryAd() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Close')]"))).click();
        boolean flag = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(text(),'Close')]")));
        Assert.assertTrue(flag);
    }

}

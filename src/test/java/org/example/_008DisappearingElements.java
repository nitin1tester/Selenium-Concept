package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class _008DisappearingElements extends Base {

    @Test(description = "Disappearing Elements")
    public void disappearingElements() {
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        List<WebElement> webElementList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id=\"content\"]//li//a")));
        System.out.println("Size is "+webElementList.size());
        boolean flag = webElementList.stream().anyMatch(e->e.getText().equals("Gallery"));
        if (flag) {
            driver.get(driver.getCurrentUrl());
            Assert.assertEquals(webElementList.size(),5);
        }else {
            Assert.assertEquals(webElementList.size(),4);
        }
    }
}

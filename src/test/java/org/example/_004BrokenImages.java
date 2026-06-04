package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _004BrokenImages extends Base {

    @Test
    public void brokenImages(){
        driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> webElementList =  driver.findElements(By.tagName("img"));
        int flag = 0;
        for (WebElement e : webElementList){
            JavascriptExecutor js = ((JavascriptExecutor)driver);
            boolean isBroken = (boolean) js.executeScript(
                    "const img = arguments[0];" +
                            "return img.complete && img.naturalWidth === 0;", e);
            if (isBroken == true) {
                System.out.println("this is isBroken Value " + isBroken);
                flag = 1;
                break;
            }
        }
        Assert.assertEquals(flag,1);
    }

}

package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _001Abtesting extends Base {

    @Test(description = "A/B Test Variation 1")
    public void abtest() {
        driver.get("https://the-internet.herokuapp.com/abtest");
        String text = driver.findElement(By.xpath("//div[@id=\"content\"]//h3")).getText();
        System.out.println("this is text value :"+text);
        if (text.equals("A/B Test Control")) {
            Assert.assertEquals(text,"A/B Test Control");
        }else{
            Assert.assertEquals(text, "A/B Test Variation 1", "String message");
        }
        // better assertion
        Assert.assertTrue(text.equals("A/B Test Control")||text.equals("A/B Test Variation 1"));
    }
    
}

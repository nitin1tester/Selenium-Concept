package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _003BasicAuth extends Base {

    @Test
    public void basicAuth() throws InterruptedException {
//        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        Thread.sleep(10000);
        String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
        Assert.assertTrue(text.contains("Congratulations!"));
    }

}

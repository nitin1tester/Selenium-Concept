package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _006Checkboxes extends Base {

    @Test
    public void checkboxes() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[following-sibling::text()[1][contains(.,'checkbox 1')]]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[following-sibling::text()[1][contains(.,'checkbox 2')]]")).click();
        Thread.sleep(10000);
    }
}

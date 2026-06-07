package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _016FileDownloader extends Base {
    @Test(description = "File Downloader")
    public void fileDownloader() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@id=\"content\"]//a"));
        for (WebElement e : webElementList){
            System.out.println(e.getText());
            if (e.getText().contains("test")) {
                e.click();
            }
        }
        Thread.sleep(15000);
    }
}

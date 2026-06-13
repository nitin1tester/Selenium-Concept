package org.example;

import base.Base;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _019FileUploader extends Base {

    @Test(description = "File Uploader")
    public void fileUploader() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    
}

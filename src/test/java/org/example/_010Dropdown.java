package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.text.html.Option;
import java.time.Duration;
import java.util.List;

public class _010Dropdown extends Base {

    @Test(description = "Dropdown List")
    public void dropdownList() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement selectDropdownBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id=\"dropdown\"]")));
        Select select = new Select(selectDropdownBar);

        List<WebElement> webElements = select.getOptions();
        for (WebElement e : webElements){
            System.out.println(e.getText());
        }
        //using stream
        webElements.stream().forEach(e -> System.out.println(e.getText()));

        select.selectByVisibleText("Option 1");
        String selectedValue = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedValue,"Option 1");
    }

}

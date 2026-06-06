package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NavigableMap;

public class _011DynamicContent extends Base {

    @Test(description = "Dynamic Content")
    public void dynamicContent() {
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> webElementList =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id=\"content\" ]//img//div[@id=\"content\" ]//img")));
        List<WebElement> webTextList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='large-10 columns']")));
        for (WebElement e : webTextList){
            System.out.println(e.getText());
        }
        String lastStringBefore = webTextList.getLast().getText();
        System.out.println("This is Last string " + lastStringBefore);
        driver.navigate().refresh();
        webTextList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='large-10 columns']")));
        String lastStringAfter = webTextList.getLast().getText();
        System.out.println("Row 3 After: " + lastStringAfter);
        Assert.assertNotEquals(lastStringBefore,lastStringAfter);
    }


}

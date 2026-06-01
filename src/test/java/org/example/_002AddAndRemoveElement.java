package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _002AddAndRemoveElement extends Base {

    @Test(description = "Add/Remove Elements")
    public void addRemoveElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementBtn = driver.findElement(By.xpath("//button[@onclick=\"addElement()\" and contains(text(),'Add Element')]"));
        addElementBtn.click();
        addElementBtn.click();
        addElementBtn.click();
        List<WebElement> webElementList =  driver.findElements(By.xpath("//button[@onclick=\"deleteElement()\" and contains(text(),'Delete')]"));
        Assert.assertEquals(webElementList.size(),3);
        for (WebElement e : webElementList){
            e.click();
        }
        List<WebElement> webElementsLst =  driver.findElements(By.xpath("//button[@onclick=\"deleteElement()\" and contains(text(),'Delete')]"));
        Assert.assertEquals(webElementsLst.size(),0);
    }
    
}

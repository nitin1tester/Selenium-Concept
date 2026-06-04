package org.example;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _005ChallengingDOM extends Base {

    @Test(description = "Challenging DOM")
    public void challengingDOM() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom#edit");
        //td[text()='Iuvaret4']/following-sibling::td[last()]//a[@href="#edit"]
        int flag = 0;
        List<WebElement> webElementList = driver.findElements(By.xpath("//tbody//td[1]"));
        for (WebElement e : webElementList){
            System.out.println(e.getText());
            if (e.getText().equals("Iuvaret4")) {
                flag = 1;
                break;
            }
        }
        System.out.println("Here is flag value "+flag);
        Assert.assertEquals(flag,1);
    }

}
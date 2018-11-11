package ru.ozon.autotests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'eCartTotal_infoCount']")
    WebElement infoCount;

    @FindBy(xpath = "//div[@class = 'eCartControls_buttons']")
    WebElement remove;

    @FindBy(xpath = "//span[@class='jsInnerContentpage_title']")
    WebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'eRemovedCartItems_title']")
    WebElement removedCartItems;


    public void removeItem() {
        waitForVisible(infoCount);
        Assert.assertEquals("Значения не соотвествует ожидаемому",
                "1 товар", infoCount.getText());
        waitForVisible(remove);
        waitToBeClickable(remove);
        remove.click();
        waitForVisible(removedCartItems);
        Assert.assertEquals("Значения не соотвествует ожидаемому",
                "Вы удалили 1 товар", removedCartItems.getText());
        waitForVisible(pageTitle);

    }


}

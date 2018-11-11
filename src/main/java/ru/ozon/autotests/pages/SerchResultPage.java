package ru.ozon.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ozon.autotests.steps.BaseSteps;

import java.util.List;
import java.util.Locale;

public class SerchResultPage extends BasePage {

    public SerchResultPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    private static final By elementsView = By.xpath("//div[@class = 'item-view']");
    private static final By addElementButton = By.xpath(".//button[@class = 'buy-button blue-cream enlarged button flat-button tile-buy-button']");
    private static final By elementPrice = By.xpath(".//span[@class = 'price-number']");
    private List<WebElement> elementList;

    public void getElementList() {
        elementList = BaseSteps.getDriver().findElements(elementsView);
    }

    //@FindBy(xpath = "//*[@data-test-id = 'filter-block-brand']//*[contains(text(), '"+itemName+"')]")
    //WebElement apple;

    @FindBy(xpath = "//div[@class='block-horizontal']/div[1]//aside/div[2]/form[@action='']/div[@class='input-container']/div[2]/input[@class='input']")
    WebElement priceFieldMax;

    @FindBy(xpath = "//div[@class='block-horizontal']/div[1]//aside/div[2]/form[@action='']/div[@class='input-container']/div[1]/input[@class='input']")
    WebElement priceFieldMin;


    @FindBy(css = ".mCart .eMyOzon_ItemWrap")
    WebElement viewCart;

//    @FindBy(xpath = "//*[@data-test-id = 'filter-block-brand']//*[contains(text(), 'Canon')]")
//    WebElement canon;
//
//    @FindBy(xpath = "//*[@data-test-id = 'filter-block-brand']//*[contains(text(), 'Nikon')]")
//    WebElement nikon;


    public void selectBrand(String itemName) {
        waitToBeClickable(BaseSteps.getDriver().findElement(By.xpath("//*[@data-test-id = 'filter-block-brand']//*[contains(text(), '" + itemName + "')]")));
        BaseSteps.getDriver().findElement(By.xpath("//*[@data-test-id = 'filter-block-brand']//*[contains(text(), '" + itemName + "')]")).click();
    }

    public void selectCategory(String categoryName) {
        waitToBeClickable(BaseSteps.getDriver().findElement(By.xpath("//*[@data-test-id = 'filter-block-viewfinder']//*[contains(text(), '" + categoryName + "')]")));
        BaseSteps.getDriver().findElement(By.xpath("//*[@data-test-id = 'filter-block-viewfinder']//*[contains(text(), '" + categoryName + "')]")).click();
    }

    public void setMaxPrice(String value) {
        waitForVisible(priceFieldMax);
        priceFieldMax.click();
        priceFieldMax.sendKeys(Keys.CONTROL + "a");
        priceFieldMax.sendKeys(value);
        priceFieldMax.sendKeys(Keys.ENTER);
        waitT(2);
    }

    public void setMinPrice(String value) {
        waitForVisible(priceFieldMin);
        priceFieldMin.click();
        priceFieldMin.sendKeys(Keys.CONTROL + "a");
        priceFieldMin.sendKeys(value);
        priceFieldMin.sendKeys(Keys.ENTER);
        waitT(3);
    }

    public void addItem() {
        //waitForVisible(elementPrice);
        // waitToBeClickable(addElementButton);
        getElementList();
        waitT(3);
        scrollToElement(elementList.get(26).findElement(addElementButton));
        elementList.get(26).findElement(addElementButton).click();
    }

    public void clickViewCart() {
        waitForVisible(viewCart);
        viewCart.click();
    }
}

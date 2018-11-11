package ru.ozon.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ozon.autotests.steps.BaseSteps;

public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class = 'eOzonCatalog_1Level jsChild_DOM_firstLevelSections']//*[contains(text(), 'Электроника')]")
    WebElement el;
    @FindBy(xpath = "//*[@class = 'bHeaderCatalogButton ' ]")
    WebElement mainMenu;
//    @FindBy(xpath = "//div[@class = 'category-filter']//*[contains(text(), 'Смартфоны')]")
//    WebElement smartfones;

    public void selectMenuItem() {
        waitToBeClickable(mainMenu);
        mainMenu.click();
    }


    public void chooseCategory(String itemName) {
        waitForVisible(el);
        el.click();
        waitToBeClickable(BaseSteps.getDriver().findElement(By.xpath("//div[@class = 'category-filter']//*[contains(text(), '" + itemName + "')]")));
        BaseSteps.getDriver().findElement(By.xpath("//div[@class = 'category-filter']//*[contains(text(), '" + itemName + "')]")).click();
    }


}

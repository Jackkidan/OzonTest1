package ru.ozon.autotests.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ozon.autotests.pages.BasePage;
import ru.ozon.autotests.pages.SerchResultPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SearchResultPageSteps extends BasePage {

    SerchResultPage serchResultPage = new SerchResultPage();

    @Step("Выбраны товары бредна")
    public void setBrand(String brand) {
        serchResultPage.selectBrand(brand);
    }

    @Step("Установлена максимальная цена")
    public void setMaxPrice(String value) {
        serchResultPage.setMaxPrice(value);
    }

    @Step("Установлена минимальная цена")
    public void setMinPrice(String value) {
        serchResultPage.setMinPrice(value);
    }

    @Step("Товар добавлен в корзину")
    public void addItem() {
        serchResultPage.addItem();
    }

    @Step("Выполнен переход в корзину")
    public void viewCart() {
        serchResultPage.clickViewCart();
    }

    @Step("Выбрана категория")
    public void selectCategory(String category) {
        serchResultPage.selectCategory(category);
    }
}

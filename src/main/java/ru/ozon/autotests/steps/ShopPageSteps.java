package ru.ozon.autotests.steps;

import ru.ozon.autotests.pages.ShopPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ShopPageSteps {

    ShopPage shopPage = new ShopPage();

    @Step("После нажатия на кнопку удалить корзина пуста")
    public void removeItems() {
        shopPage.removeItem();
    }
}

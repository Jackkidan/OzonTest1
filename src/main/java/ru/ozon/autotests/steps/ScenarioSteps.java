package ru.ozon.autotests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import ru.ozon.autotests.pages.MainPage;
import ru.ozon.autotests.pages.SerchResultPage;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    SearchResultPageSteps serchResultSteps = new SearchResultPageSteps();
    ShopPageSteps shopPageSteps = new ShopPageSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String item) {
        mainPageSteps.selectMenuItem(item);
    }

    @When("^выбраны товары бренда \"(.+)\" с максимальной ценой  \"(.+)\"$")
    public void selectItemWithParamsMax(String brand, String maxPrice) {
        serchResultSteps.setMaxPrice(maxPrice);
        serchResultSteps.setBrand(brand);
    }

    @When("^выбраны товары бренда \"(.+)\" с минимальной ценой  \"(.+)\"$")
    public void selectItemWithParamsMin(String brand, String minPrice) {
        serchResultSteps.setMinPrice(minPrice);
        serchResultSteps.setBrand(brand);
    }

    @When("^выбран товар бренда \"(.+)\"$")
    public void selectItemWithParams(String brand) {
        serchResultSteps.setBrand(brand);
    }

    @Then("^Товар добавлен в корзину покупок$")
    public void addItem() {
        serchResultSteps.addItem();
    }

    @And("^Выполнен переход в корзину покупок$")
    public void viewCart() {
        serchResultSteps.viewCart();
        serchResultSteps.viewCart();
    }

    @And("^выбрана категория \"(.+)\"$")
    public void selectCategory(String category) {
        serchResultSteps.selectCategory(category);
    }

    @Then("^После нажатия на кнопку удалить корзина пуста$")
    public void removeItems() {
        shopPageSteps.removeItems();
    }
}

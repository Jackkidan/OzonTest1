package ru.ozon.autotests.steps;

import ru.ozon.autotests.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Step("выбран пункт меню")
    public void selectMenuItem(String item) {
        mainPage.selectMenuItem();
        mainPage.chooseCategory(item);
    }
}

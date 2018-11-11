package ru.ozon.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ozon.autotests.steps.BaseSteps;

import java.time.Duration;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    BaseSteps steps = new BaseSteps();

    void fillField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
    }

    void waitForVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(steps.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    void waitForVisible(By path) {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    void waitToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(steps.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    void waitToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(steps.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    void scrollToElement(WebElement element) {
        ((JavascriptExecutor) steps.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    void waitT(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

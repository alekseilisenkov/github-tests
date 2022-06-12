package com.github.test.issue;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com/");

    }
    @Step("Ищем репозиторий {repo}")
    public void searchForRepo(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").submit();

    }
    @Step("Переходим в репозиторий {repo}")
    public void goToRepo(String repo) {
        $(By.linkText(repo)).click();

    }
    @Step("Проверка видимости вкладки ISSUES")
    public void issueTabIsVisible() {
        $("#issues-tab").shouldBe(Condition.visible);

    }
    @Step("Проверка наличия текста Issues на странице")
    public void issueTabTextExist() {
        $("#issues-tab").shouldHave(Condition.text("Issues"));

    }
}

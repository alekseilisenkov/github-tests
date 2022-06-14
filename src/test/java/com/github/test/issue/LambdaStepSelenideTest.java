package com.github.test.issue;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepSelenideTest {

    public static final String REPO = "eroshenkoam/allure-example";

    @Test
    public void IssueTest() {
        step("Открываем главную страницу", () -> {
            open("https://github.com/");
        });

        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPO);
            $(".header-search-input").submit();
        });

        step("Переходим в репозиторий", () -> {
            $(By.linkText(REPO)).click();
        });

        step("Проверка видимости вкладки ISSUES", () -> {
            $("#issues-tab").shouldBe(Condition.visible);
        });

        step("Проверка наличия текста Issues на странице", () -> {
            $("#issues-tab").shouldHave(Condition.text("Issues"));
        });
    }
}

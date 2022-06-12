package com.github.test.issue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    public static final String REPO = "eroshenkoam/allure-example";

    @Test
    public void IssueTest() {
        open("https://github.com/");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPO);
        $(".header-search-input").submit();

        $(By.linkText(REPO)).click();
        $("#issues-tab").shouldBe(Condition.visible);
        $("#issues-tab").shouldHave(Condition.text("Issues"));

    }

}

package com.github.test.issue;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AnnotatedStepSelenideTest {

    public static final String REPO = "eroshenkoam/allure-example";

    private WebSteps steps = new WebSteps();

    @Test
    public void AnnotatedStepsIssueTest() {
        steps.openMainPage();
        steps.searchForRepo(REPO);
        steps.goToRepo(REPO);
        steps.issueTabIsVisible();
        steps.issueTabTextExist();
    }
}

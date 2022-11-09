package com.github.test.issue;

import org.junit.jupiter.api.Test;

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

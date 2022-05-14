package com.github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
    @Test
    @DisplayName("searchForSoftAssertions")
    void searchForSoftAssertions (){

        open("https://github.com/selenide/selenide");
        $$(".UnderlineNav-body.list-style-none li").get(5).click();
        $(".Layout-main").shouldHave(text("Soft assertions"));
        $(".markdown-body").$(byText("Soft assertions")).click();
        $("html").shouldHave(text("3. Using JUnit5 extend test class:"), text("SoftAssertsExtension"), text("."));
    }
}

package com.github.test.search;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {

    @Test
    void shouldFindSelenideRepositoryName() {
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("h2").should(text("selenide / selenide"));
    }
}

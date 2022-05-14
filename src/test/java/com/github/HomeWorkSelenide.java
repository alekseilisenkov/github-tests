package com.github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class HomeWorkSelenide {
    @Test
    @DisplayName("searchForSoftAssertions")
    void searchForSoftAssertions (){
        //открыть github.com на страницу selenide
        open("https://github.com/selenide/selenide");

        //открыть xWiki проекта
        $$(".UnderlineNav-body.list-style-none li").get(5).click();

        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Layout-main").shouldHave(text("Soft assertions")); //$(".body") или $(".html") что проверить тело

        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").$(byText("Soft assertions")).click();

        //Поиск заголовка и куска кода в теле страницы
        $("html").shouldHave(text("3. Using JUnit5 extend test class:"), text("SoftAssertsExtension"), text("."));

    }
}

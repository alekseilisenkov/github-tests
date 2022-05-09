package github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class question {
    @Test
    @DisplayName("searchForSoftAssertions")
    void searchForSoftAssertions() {
        //открыть github.com на страницу selenide
        open("https://github.com/selenide/selenide");

        //открыть xWiki проекта
        $$(".UnderlineNav-body.list-style-none li").get(5).click();

        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Layout-main").shouldHave(text("Soft assertions")); //$(".body") или $(".html") что проверить тело
    }
}
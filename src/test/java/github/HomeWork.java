package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class HomeWork {
    @Test
    @DisplayName("Rumpatapata")
    void searchForSoftAssertions (){
        //открыть github.com на страницу selenide
        open("https://github.com/selenide/selenide");

        //открыть xWiki проекта
        $$(".UnderlineNav-body.list-style-none li").get(5).click();

        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Layout-main").shouldHave(text("Soft assertions"));

        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        $$(".internal present").$(byText("Soft assertions")).click();
       // $$(".Layout-main li").get(5).click();





        sleep(5000);
    }
}

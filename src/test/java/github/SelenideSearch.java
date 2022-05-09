package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {
    @Test
    void shouldFindSelenideRepositoryName() {
        //открыть github.com
        open("https://github.com");
        //ввести в поле поиска selenide и нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

        //нажимаем на линк от первого результата пользователя
        var listOfRepositores=$$(".repo-list"); //пример использования переменной
        listOfRepositores.first().$("a").click();

        //check: в заголовке встречаются selenide/selenide
        $("h2").should(text("selenide / selenide"));

        sleep(5000);



        //arrange
        //act
        //assert
    }
}

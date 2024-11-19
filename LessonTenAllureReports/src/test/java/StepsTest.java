import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepsTest extends LessonTenBeforeAll{



        @Test
        public  void testIssuesLambdaStep(){
            SelenideLogger.addListener("allure",new AllureSelenide());
            step("Открываем главную страницу",()->{
                open("");
            });
            step("Вводим значение в строку поиска",()->{$(".search-input-container").click();});
            step("Нажимаем на строку поиска ",()->{ $("#query-builder-test").setValue("eroshenkoam/allure-example").pressEnter();});
            step("Открываем репозиторий eroshenkoam/allure-example",()->{ $(".Box-sc-g0xbh4-0.JcuiZ").$("a.prc-Link-Link-85e08").click();});
            step("Открываем Issues",()->{$("#issues-repo-tab-count").click();});
            step("Проверяем наличие записи #80",()->{$(withText("#80")).should(Condition.exist);});







        }
    @Test
    public void testAnnotationStep(){
        SelenideLogger.addListener("allure",new AllureSelenide());
        WebSteps webSteps=new WebSteps();
          webSteps.openMainpage();
          webSteps.inputStringSearch();
          webSteps.clickStringSearch();
          webSteps.openRepositories();
          webSteps.openIssues();
          webSteps.searchRecord();
    }

    }



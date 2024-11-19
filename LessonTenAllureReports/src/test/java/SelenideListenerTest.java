import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class SelenideListenerTest extends LessonTenBeforeAll{

    @Test
    public  void testIssuesSearch(){
        SelenideLogger.addListener("allure",new AllureSelenide());
        open("");
        $(".search-input-container").click();
        $("#query-builder-test").setValue("eroshenkoam/allure-example").pressEnter();
        $(".Box-sc-g0xbh4-0.JcuiZ").$("a.prc-Link-Link-85e08").click();
        $("#issues-repo-tab-count").click();
        $(withText("#80")).should(Condition.exist);

    }


}

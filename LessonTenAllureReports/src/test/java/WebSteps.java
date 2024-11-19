import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Открываем главную страницу")
    public void openMainpage(){
        open("");}
        @Step("Вводим значение в строку поиска")
        public void inputStringSearch(){
            $(".search-input-container").click();}

    @Step("Нажимаем на строку поиска")
    public void clickStringSearch(){
        $("#query-builder-test").setValue("eroshenkoam/allure-example").pressEnter();
    }
@Step("Открываем репозиторий eroshenkoam/allure-example")
public void openRepositories(){
    $(".Box-sc-g0xbh4-0.JcuiZ").$("a.prc-Link-Link-85e08").click();
}
    @Step("Открываем Issues")
    public void openIssues(){
        $("#issues-repo-tab-count").click();
    }
    @Step("Проверяем наличие записи #80")
    public void searchRecord(){
        $(withText("#80")).should(Condition.exist);
    }
}



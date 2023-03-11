package pages.forSearchPage;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ForSearchWorkPage {
    private static final SelenideElement LookElementSearch = $x("//*[@class='link link_title'][1]");

    @Step("Запомненный эелемент")
    public String LookSearchElements() {
        return LookElementSearch.getText();
    }

    @Step("Сброс фильтра города")
    @Step("Ввод запомненного занчения в поиск")
    @Step("Переход в найденную первую вакансию")

}

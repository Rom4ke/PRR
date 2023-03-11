package pages.forMainPage;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import main.BasePage;
import pages.forSearchPage.ForSearchWorkPage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class ForMainPage {
    private static final SelenideElement LookElement = $x("//h1");
    public static final SelenideElement ButtonSearchWork = $x("//a[@class='mega-menu__link'][contains(text(),'Поиск работы')]");

    @Step("Открыть сайт")
    public ForMainPage siteUrl(String SITE_URL){
        open(SITE_URL);
        BasePage.attachScreenshot();
        return this;
    }

    @Step("Запомненный эелемент")
    public String LookElements() {
        return LookElement.getText();
    }

    @Step("Клик на Поиск работы")
    public ForSearchWorkPage buttonSearchWork(){
        return new ForSearchWorkPage();
    }
}

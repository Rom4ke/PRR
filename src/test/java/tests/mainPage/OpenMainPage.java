package tests.mainPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import main.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.forMainPage.ForMainPage;

public class OpenMainPage extends TestBase {
    private static String SITE_URL = System.getProperty ("site_url", "https://trudvsem.ru/");
    private static String TITLE = "Найдите работу вашей мечты в любой точке России";


    @Epic(value = "Главная страница")
    @Test
    @Description(value = "Проверка открытия страницы")

    public void openMainPage(){
        new ForMainPage().siteUrl(SITE_URL);

        Assertions.assertEquals(new ForMainPage().LookElements(), TITLE);
    }

}

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта
 */
public class MainPage {
    private final SelenideElement searchButton = $x("//form");

    public void clickOnSearch() {
        searchButton.click();
    }
    public void openWedSite(String url){
        Selenide.open(url);
    }
}
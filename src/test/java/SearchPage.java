import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;
public class SearchPage {
    private final ElementsCollection articleTitels = $$x("//h2//a");
    /**
     * Возвращает href из первой строки
     */
    public String getHrefFromFirstArticle() {
        return articleTitels.first().getAttribute("href");
    }
}

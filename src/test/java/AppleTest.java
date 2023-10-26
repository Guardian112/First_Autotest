import org.junit.Test;

public class AppleTest extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru";
    private final static String SEARCH_STRING = "Чем отличается iPhone 13 от iPhone 12";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
        MainPage.search(SEARCH_STRING);
        int a = 0;
    }
}

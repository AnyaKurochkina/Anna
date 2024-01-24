import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestUI {

    @Test
    @DisplayName("Проверка открытия главной страницы")
    void testOpenMainPage() {

        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");

    }
}

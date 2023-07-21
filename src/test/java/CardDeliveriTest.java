import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveriTest {
    //@BeforeAll
    @Test
    void setUpTests() {
        open("http://localhost:9999");
        $("[data-test-id=city] input").setValue("Челябинск");
        $("[data-test-id=name] input").setValue("Иванов Иван");
        $("[data-test-id=phone] input").setValue("+79001005050");
        $(".data-day=24.07.2023");
//        $("[data-test-id=date] input").setValue("24.07.2023");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $(".notification_content");
        $(withText("Встреча успешно забронирована на")).shouldBe(visible, Duration.ofSeconds(14));
    }

}


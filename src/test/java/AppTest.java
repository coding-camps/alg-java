import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void sayHello() {
        String appStr = App.sayHello();
        Assertions.assertEquals(App.helloStr, appStr);
    }
}

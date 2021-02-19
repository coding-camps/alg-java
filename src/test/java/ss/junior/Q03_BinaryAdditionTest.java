package ss.junior;

import org.junit.jupiter.api.Test;
import util.DataUtil;

import java.util.List;

class Q03_BinaryAdditionTest {

    @Test
    public void add2BinaryNum() {
        List<TestData> data = DataUtil.getRecoardList("ss/junior/q03-data.csv", TestData.class);
        data.stream().forEach(System.out::println);
    }

    public static class TestData {
        public String num1;
        public String num2;
        public String expect1;
        public String expect2;

        @Override
        public String toString() {
            return "MyData{" +
                    "num1='" + num1 + '\'' +
                    ", num2='" + num2 + '\'' +
                    ", expect1='" + expect1 + '\'' +
                    ", expect2='" + expect2 + '\'' +
                    '}';
        }
    }

}

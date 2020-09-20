package ss.junior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;

public class Q_02_AvertFoxTest {

    @Test
    public void foxEatRabbits() {
        String filepath = "ss/junior/q02-data.csv";

        List<MyData> myData = DataUtil.getRecoardList(filepath, MyData.class);
        myData.stream().forEach(data -> {
            int result = Q_02_AvertFox.foxEatRabbits(data.foxPos, data.rabbits);
            Assertions.assertEquals(data.expect, result);
        });

    }


    public static class MyData {
        public int expect;
        public int[] foxPos;
        public int[] rabbits;

        @Override
        public String toString() {
            return "MyData{" +
                    "expect=" + expect +
                    ", foxPos=" + Arrays.toString(foxPos) +
                    ", rabbits=" + Arrays.toString(rabbits) +
                    '}';
        }
    }

}

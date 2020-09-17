package ss.junior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q_01_BracketsTest {

    @Test
    public void findCorresponding() {
        findCorresponding("()()()()", 4, 5);
        findCorresponding("()((())())(())", 2, 9);
        findCorresponding("())((()(()))", -1, -1);
    }

    private void findCorresponding(String brackets, int leftIndex, int expected) {
        int result = Q_01_Brackets.findCorresponding(brackets, leftIndex);
        Assertions.assertEquals(expected, result);
    }
}

package ss.junior;

/**
 * 在 20 x 20 的格子中有一只狐狸和若干兔子。狐狸可以吃掉水平、竖直和对角线上在一条直线上的兔子。<br/>
 * 注意：不考虑同一格子中有多只动物的情况。坐标用数组表示。<br/>
 * <br/>
 * 输入：狐狸的坐标列表，兔子的坐标列表。<br/>
 * 输出：狐狸可吃掉的兔子的数量。
 */
public class Q_02_AvertFox {

    public static int foxEatRabbits(int[] foxPos, int[] rabbitsPos) {
        int count = 0;

        int len = rabbitsPos.length / 2;
        for (int i = 0; i < len; i++) {
            if ((Math.abs(foxPos[0] - rabbitsPos[2 * i]) == Math.abs(foxPos[1] - rabbitsPos[2 * i + 1]))
                    || foxPos[0] == rabbitsPos[2 * i]
                    || foxPos[1] == rabbitsPos[2 * i + 1]
            ) {
                count++;
            }
        }

        return count;
    }

}

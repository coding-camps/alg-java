package ss.junior;

/**
 * 给定一个由左括号“(”和右括号“)”组成的字符串。合法的括号满足匹配规则：<br/>
 * 1. 互相匹配的一对括号，左括号必须在右括号的左边；<br/>
 * 2. 左右括号中间可以有其他括号，但也必须是匹配的；<br/>
 * 3. 左右括号数量要相等；<br/>
 * 否则，字符串括号匹配是非法的。<br/>
 * <br/>
 * 要求：输入一个字符串，和一个左括号的索引（从零开始）。<br/>
 * 输出：如果是合法的，则返回对应匹配右括号的索引。如果是非法的，则返回-1。
 */
public class Q_01_Brackets {

    public static int findCorresponding(String brackets, int leftIndex) {
        int len = brackets.length();
        int bracketCnt = 0;
        int memory = 0;
        int result = -1;

        for (int i = 0; i < len; i++) {
            char c = brackets.charAt(i);
            if (c == '(') {
                bracketCnt++;
                if (i == leftIndex && result == -1) {
                    memory = bracketCnt;
                }
            } else if (c == ')') {
                if (memory > 0 && bracketCnt == memory && result == -1) {
                    result = i;
                }
                bracketCnt--;
            }
            if (bracketCnt < 0) {
                result = -1;
                break;
            }
        }
        return result;
    }

}

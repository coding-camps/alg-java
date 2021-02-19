package math.comb;

public class CombTheory {

    private static int MAX_N = 10;
    private static int n, m;/*从n个数中取m个的排列 */
    private static int[] rcd = new int[MAX_N];/*记录每个位置的数*/
    private static int[] num = new int[MAX_N];/*存放输入的数 */
    private static int count = 0; /*记录已经找到多少个 */

    /*打印结果 */
    private static void printArray(int[] A, int n) {
        int i;
        System.out.printf("第%4d 个 : ", ++count);
        for (i = 0; i < n; i++) {
            System.out.printf("%4d", A[i]);
        }
        System.out.printf("%n");
    }


    /*再排列*/
    private static void perm(int[] array, int n, int m) {
        if (m == n) {
            printArray(array, n);
        } else {
            int j, temp;
            for (j = m; j < n; j++) {
                temp = array[j];
                array[j] = array[m];
                array[m] = temp;
                perm(array, n, m + 1);
                temp = array[m];
                array[m] = array[j];
                array[j] = temp;
            }
        }
    }

    /*先组合*/
    private static void comb(int l, int p) {
        int i;
        if (l == m) {
            perm(rcd, m, 0);
            return;
        }
        for (i = p; i < n; i++) {
            rcd[l] = num[i];
            comb(l + 1, i + 1);
        }
    }

    /*计算从n个数中取m个数的排列*/
    public static void main(String[] args) {
        int i;
        n = 6;
        m = 3;
        for (i = 0; i < n; i++) {
            num[i] = i + 1;
        }
        comb(0, 0);
    }

/*********************************
 基本算法思想：
 记
 C(n,m) 表示从n个数中取m个数的组合
 p(n,m) 表示从n个数中取m个数的排列
 特别的，p(n,n)表示从n个数的全排列
 则
 p(n,m) = c(n,m) ×p(n,n)
 换句话说：
 从n个数中取m个数组成的排列，转化为
 先从 n 个数中取 m 个数组成一个组合，
 然后对这个组合中的 m 个数进行全排列。
 *********************************/

}

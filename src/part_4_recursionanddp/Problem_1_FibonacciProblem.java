package part_4_recursionanddp;

/**
 * Created by oneball on 2018/5/3.
 */
public class Problem_1_FibonacciProblem {
    public static int f1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }

    public static int f2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int res = 1;
        int pre = 1;
        int tmp = 0;
        return 0;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(f1(n));
    }
}

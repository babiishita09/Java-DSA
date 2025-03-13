package Recursion;

/*
  0,1,1,2,3,5,8,13,.......................
   */
public class FibonacciSeries {
    static int Fibo(int n) {
//        base condition
        if (n < 2)
            return n;
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void main(String[] args) {
        int N = 20;

        for (int i = 0; i < N; i++) {
            System.out.print(Fibo(i) + " ");
        }
    }
}

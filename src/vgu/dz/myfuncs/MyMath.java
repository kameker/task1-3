package vgu.dz.myfuncs;

public class MyMath {
    public static double getHypotenuse(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static long lenOfNumber(long number) {
        return (long) Math.floor(Math.log10(number) + 1);
    }

    public static long reverseNumber(long num) {
        long result = 0;
        long lenNum = lenOfNumber(num) - 1;
        while (num > 0) {
            result += (long) (num % 10 * Math.pow(10, lenNum));
            lenNum--;
            num /= 10;
        }
        return result;
    }

    public static long f9(long n1) {
        n1 -= 2;
        long r = 0;
        while (n1 > 0) {
            r += (long) (9 * Math.pow(10, n1));
            n1--;
        }
        return r;
    }

    public static long getUpGranica(long n1) {
        return n1 == 1 ? 0 : (long) (Math.pow(10, n1 - 1) + f9(n1) + 8);
    }

    public static long halfPalindromtoFull(long n1, long k, long d) {
        return (long) (n1 * Math.pow(10, lenOfNumber(n1) - k)) + reverseNumber(n1 / d);
        //        100_000 * 10^5 +
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static long supFactorial(int n, int k) {
        long result = 1;
        for (int i = 0; i < n;i++){
            result *= k;
            k += 2;
        }
        return result;
    }
}

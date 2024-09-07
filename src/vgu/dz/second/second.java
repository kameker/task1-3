package vgu.dz.second;

import java.util.Locale;

public class second {
    public static void N1(double a, double b, double c) {

        if (b != 0 && c != 0) {
            double D = b * b - 4 * a * c;
            if (D == 0) {
                System.out.printf("x = %.3f%n", ((-1) * b + Math.sqrt(D)) / 2 * a);
            } else if (D > 0) {
                System.out.printf("x1 = %.3f%n", ((-1) * b + Math.sqrt(D)) / 2 * a);
                System.out.printf("x2 = %.3f%n", ((-1) * b - Math.sqrt(D)) / 2 * a);
            } else {
                System.out.println("x = чему то комплексному");
            }
        } else if (b == 0 && c != 0) {
            if (c > 0) {
                System.out.println("x = чему то комплексному");
            } else {
                System.out.printf("x1 = %.3f%n", Math.sqrt((-1) * c / a));
                System.out.printf("x2 = %.3f%n", (-1) * Math.sqrt((-1) * c / a));
            }
        } else if (b != 0 && c == 0) {
            System.out.printf("x1 = %.3f%n", 0);
            System.out.printf("x2 = %.3f%n", (-1) * b / a);
        } else {
            System.out.println("Это не квадратное уравнение");
        }
    }

    public static void N2(double m, double t, double k) {
        double q = k - m * 4200 * (100 - t);
        if (q <= 0) {
            System.out.printf("m = %.3f%nt = %.3f%n", m, (k + m * 4200 * t) / 4200 / m);
        } else {
            double q2 = q - 2.3 * 1000000 * m;
            if (q2 <= 0) {
                System.out.printf("m = %.3f%nt = %d%n", q2 / 2.3 / 1000000, 100);
            }
            else{
                System.out.printf("А дальше не состыковочка, говориться про параметры воды, а тут уже пар%n");
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        N2(2, 90, 10 * 2 * 4200);
    }
}

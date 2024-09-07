package vgu.dz.first;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void N1(double V1, double t1, double V2, double t2) {
        System.out.printf("V3 = %.3f%nt3 = %.3f%n", V1 + V2, (t1 + t2) / 2f);
        // 1.	Смешано V1 литров воды температуры t1 с V2 литрами воды температуры t2.
        // Составить программу вычисления объема и температуры образованной смеси.
    }

    public static double N2(double S, double V1, double V2, double a1, double a2) {
        double a = a1 + a2;         //2. Составить программу для вычисления времени t встречи автомобилей,
        double b = 2 * (V1 + V2);   // движущихся равноускоренно навстречу друг другу,
        double c = 2 * S;           // если известны их скорости V1 и V2, ускорения а1 и а2 и начальное расстояние S между ними.
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return -1;
        }
        double t3 = (-1) * b - Math.sqrt(D);
        double t4 = (-1) * b + Math.sqrt(D);
        if (t3 < 0 && t4 < 0) {
            return -1;
        }
        return Math.max(t3, t4);
    }

    public static double N3(double rad) {//3.	В квадрат вписана окружность (рис. 1.3). Определить площадь заштрихованной части фигуры, если известен радиус окружности
        return (rad * rad * (4 - Math.PI)) / 2f;
    }

    public static double N4(double rad) {// 4.	В квадрат вписана окружность (рис. 1.4). Определить площадь заштрихованной части фигуры, если известна длина стороны квадрата.
        return N3(rad) + Math.PI * rad * rad;
    }

    public static double N5(double rad) {//5.	В квадрат вписана окружность (рис. 1.5). Определить площадь заштрихованной части фигуры, если известна длина стороны квадрата.
        return N3(rad) / 2f + rad * rad;
    }

    public static void N6(double a, double b, double c, double d, double e, double f) {// 6.	Составить программу для решения системы двух линейных уравнений с двумя неизвестными.
        double delta = a * e - b * d;
        if (delta == 0) {
            System.out.println("Нет? или что писать то");
        }
        System.out.printf("x = %.3f%ny = %.3f%n", (c * e - b * f) / delta, (a * f - c * d) / delta);
    }

    public static double N7(double V, double U, double T1, double T2) {// 7.	Скорость лодки в стоячей воде V км/ч, скорость течения реки U км/ч (U < V). Время движения лодки по озеру T1 ч, а по реке (против течения) — T2 ч. Определить путь S, пройденный лодкой.
        return V * T1 + (V - U) * T2;
    }

    public static void N8(double a, double b) {//8.	Найти периметр и площадь прямоугольного треугольника, если даны длины его катетов a и b.
        System.out.printf("P = %.3f%nS = %.3f%n", a + b + Math.sqrt(a * a + b * b), a * b / 2f);
    }

    public static void N9(double a, double b, double c) {//9.	Известны длины сторон a, b, c треугольника. Вычислить высоты этого треугольника.
        double p = (a + b + c) / 2;
        double pp = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Ha = %.3f%nHb = %.3f%nHc = %.3f%n", 2f / a * pp, 2f / b * pp, 2f / c * pp);
    }

    public static double N10(double c) {//10.	Вычислить площадь окружности, вписанной в прямоугольный равнобедренный треугольник, если известна длина его гипотенузы.
        double rad = (2 * Math.sqrt(c * c / 2) - c) / 2;
        return rad * rad * Math.PI;
    }

    public static double N11(double rad, double H) {//11.	Вычислить объем цилиндра c основанием радиуса R и высотой H.
        return Math.PI * rad * rad * H;
    }

    public static double N12(double V) {
        return V*2/9.8;
    }

    public static double N13(double a) {
        return Math.PI * Math.sqrt(2 * a * a) * Math.sqrt(2 * a * a);
    }

    public static int N14(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public static void N15(double L) {
        double R = L / 2 / Math.PI;
        System.out.printf("R = %.3f%nS = %.3f%n", R, R * R * Math.PI);
    }

    public static void N16(double a, double b, double c) {
        System.out.printf("a = %.3f%nb = %.3f%nc = %.3f%n", a, b, c);
        a = a + c;
        c = a - c;
        a = a - c;
        a = a + b;
        b = a - b;
        a = a - b;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.printf("a = %.3f%nb = %.3f%nc = %.3f%n", a, b, c);

    }

    public static double N17_21a(double R) {// малый скруглённый треугольник
        return R * R * Math.PI / 8;
    }

    public static double N17_21b(double R1, double R2) {// скруглённая трапеция
        return R2 * R2 * Math.PI / 8 - N17_21a(R1);
    }

    public static double N17_21c(double R1, double R2) {// 8-я часть фаски? как это назвать
        return (4 * R2 * R2 - Math.PI * R2 * R2) / 8;
    }

    public static double N22_26a(double R0) {
        return R0 * R0 * Math.PI / 8;
    }

    public static double N22_26b(double R0, double R1) {
        return N17_21a(R1) - R0 * R0 * Math.PI / 8;
    }

    public static double N17(double R1, double R2) {
        return 4 * N17_21a(R1) + 3 * N17_21b(R1, R2) + 2 * N17_21c(R1, R2);
    }

    public static double N18(double R1, double R2) {
        return 3 * N17_21a(R1) + 2 * N17_21b(R1, R2) + 1 * N17_21c(R1, R2);
    }

    public static double N19(double R1, double R2) {
        return 3 * N17_21a(R1) + 4 * N17_21c(R1, R2);
    }

    public static double N20(double R1, double R2) {
        return 6 * N17_21a(R1) + 1 * N17_21b(R1, R2) + 1 * N17_21c(R1, R2);
    }

    public static double N21(double R1, double R2) {
        return 2 * N17_21a(R1) + 6 * N17_21b(R1, R2) + 2 * N17_21c(R1, R2);
    }

    public static double N22(double R0, double R1, double R2) {
        return 2 * N22_26a(R0) + 3 * N22_26b(R0, R1) + 4 * N17_21b(R1, R2) + 5 * N17_21c(R1, R2);
    }

    public static double N23(double R0, double R1, double R2) {
        return 0 * N22_26a(R0) + 3 * N22_26b(R0, R1) + 0 * N17_21b(R1, R2) + 2 * N17_21c(R1, R2);
    }

    public static double N24(double R0, double R1, double R2) {
        return 0 * N22_26a(R0) + 8 * N22_26b(R0, R1) + 0 * N17_21b(R1, R2) + 8 * N17_21c(R1, R2);
    }

    public static double N25(double R0, double R1, double R2) {
        return 0 * N22_26a(R0) + 4 * N22_26b(R0, R1) + 0 * N17_21b(R1, R2) + 6 * N17_21c(R1, R2);
    }

    public static double N26(double R0, double R1, double R2) {
        return 1 * N22_26a(R0) + 5 * N22_26b(R0, R1) + 2 * N17_21b(R1, R2) + 4 * N17_21c(R1, R2);
    }

    public static double N27(double m, double k, int n) {
        k += 100;
        k /= 100;
        return m * Math.pow(k, n);
    }
    public static double N28(double h1,double m1, double s1,double h2,double m2, double s2){
        return(Math.abs(h1*3600+m1*60+s1-h2*3600-m2*60-s2));
    }
    public static int N29(int num){
        int result = 0;
        int p = 2;
        while (num > 0){
            result += (num % 10 * Math.pow(10,p));
            num /=10;
            p--;
        }
        return result;
    }
    public static int N30(int num1,int num2,int num3){
        return num1+num2+num3 - Math.max(Math.max(num1,num2),num3) - Math.min(Math.min(num1,num2),num3);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        System.out.println(N30(1,100,2));
    }
}
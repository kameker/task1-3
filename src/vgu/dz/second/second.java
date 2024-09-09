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
            double q2 = q - 2.3 * 1000_000 * m;
            if (q2 <= 0) {
                System.out.printf("m = %.3f%nt = %d%n", q2 / 2.3 / 1000_000, 100);
            } else {
                System.out.printf("А дальше не состыковочка, говориться про параметры воды, а тут уже пар%n");
            }
        }
    }

    public static void N3(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double O = Math.atan(y / x);
        if (x == 0) {
            System.out.println("x не может быть равен 0");
        } else {
            System.out.printf("r = %.3f%nO = %.3f%n", r, O);
        }
    }

    public static void N5(double x1, double y1, double x2, double y2, double x3, double y3) {
        double ab = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));//c
        double bc = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));//a
        double ca = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));//b
        //System.out.println(ab + " " + bc + " " + ca);
        double ang_ab_bc = Math.acos((ca * ca - bc * bc - ab * ab) / (-1) / bc / ab);//бета
        double ang_bc_ac = Math.acos((ab * ab - bc * bc - ca * ca) / (-1) / ca / bc);//сигма
        double ang_ca_ab = Math.acos((bc * bc - ca * ca - ab * ab) / (-1) / ca / ab);//альфа
        //System.out.println(ang_ab_bc + " " + ang_bc_ac + " " + ang_ca_ab);
        double min = Math.min(ab, Math.min(bc, ca));
        double max = Math.max(ab, Math.max(bc, ca));
        double avg = ab + bc + ca - min - max;

        if (min + avg > max) {
            String ang, name;
            if (min == max && max == avg) {
                name = "равносторонний";
            } else if ((min == avg && avg != max) || (max == avg && avg != min)) {
                name = "равнобедренный";
            } else {
                name = "разносторонний";
            }
            //System.out.println(Math.sqrt(min*min+avg*avg)+ " "+ max*max);
            if (ang_bc_ac > 90 || ang_ca_ab > 90 || ang_ab_bc > 90) {
                ang = "тупоугольный";
            } else if (Math.sqrt(min * min + avg * avg) == max) {
                ang = "прямоугольный";
            } else {
                ang = "остроугольный";
            }
            System.out.printf("Треугольник - %s, %s.", name, ang);
        } else {
            System.out.printf("Такой треугольник невозможен%n");
        }
    }

    public static void N6(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x1 - x2) * (x1 - x3) + (y1 - y2) * (y1 - y3) == 0) {
            System.out.printf("Dx = %.3f%nDy = %.3f%n", x2 - x1 + x3 - x1 + x1, y2 - y1 + y3 - y1 + y1);
        } else if ((x2 - x3) * (x2 - x1) + (y2 - y3) * (y2 - y1) == 0) {
            System.out.printf("Dx = %.3f%nDy = %.3f%n", x3 - x2 + x1 - x2 + x2, y3 - y2 + y1 - y2 + y2);
        } else {
            System.out.printf("Dx = %.3f%nDy = %.3f%n", x3 - x1 + x3 - x2 + x3, y3 - y1 + y3 - y2 + y3);
        }

    }
    public static void N7(double x, double y){
        if (x > 0 && y > 0){
            System.out.println("1");
        }
        else if (x > 0 && y < 0){
            System.out.println("4");
        }
        else if (x < 0 && y < 0){
            System.out.println("3");
        }
        else if (x < 0 && y > 0){
            System.out.println("2");
        }
    }
    public static void N8(double a1,double b1,double c1,double a2,double b2,double c2){
        double k1 = (-1) * a1/b1;
        double k2 = (-1) * c1/b1;
        double k3 = (-1) * a2/b2;
        double k4 = (-1) * c2/b2;
        if (k1 == k3 && k2 == k4){
            System.out.println("Графики параллельны");
        }
        else if(k1 == k3){
            System.out.println("Графики совпадают");
        }
        else {
            double x = (c1*b2-c2*b1) / (a2*b1 - a1*b2);
            double y = (-1) * a1/b1*x - c1/b1;
            System.out.printf("Графики пересекаются в точке: %n    x = %.3f%n    y = %.3f%n",x,y);
        }

    }
    public static void N9(){
        
    }

    public static void N24(int n, int m) {
        if (n - m == 0) {
            System.out.printf("Очки команды 1 = %d%nОчки команды 2 = %d%n", 1, 1);
        } else if (n > m) {
            System.out.printf("Очки команды 1 = %d%nОчки команды 2 = %d%n", 3, 0);
        } else {
            System.out.printf("Очки команды 1 = %d%nОчки команды 2 = %d%n", 0, 3);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        N8(1,2,3,4,5,6);
    }
}


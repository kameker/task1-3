package vgu.dz.Main;

import java.util.Locale;
import java.util.Scanner;

import vgu.dz.third.PointInSurface;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        PointInSurface pis = new PointInSurface(x, y);
        Boolean cirle = pis.pointInCircle(6, -2, 5);
        Boolean rectangle = pis.pointInRectangle(-2, 1, 6, 6);
        Boolean rectangel2 = pis.pointInRectangle(-8,-2,2,2);
        Boolean parbolaUp = pis.pointUnderAndInLineLikeABC(1, 12, 32);
        Boolean underLine = pis.pointUnderAndInLineLikeKXplusB(0, -2);
        Boolean paroblaLeftBig = pis.pointUnderAndInLineLikeABCx(1f / 8, -0.5, 13f / 2);
        Boolean parabolaLeftLittle = pis.pointUnderAndInLineLikeABCx(1, 12, 33);
        if (cirle && !parabolaLeftLittle) {
            System.out.println("Yellow");
        } else if ((rectangle && parbolaUp && !parabolaLeftLittle) || (parabolaLeftLittle && parbolaUp) || (parbolaUp && paroblaLeftBig)) {
            System.out.println("Green");
        } else if (parabolaLeftLittle && !parbolaUp && !cirle && !paroblaLeftBig) {
            System.out.println("Orange");
        } else if ((paroblaLeftBig && !parbolaUp) && !parabolaLeftLittle || (!parbolaUp && !parabolaLeftLittle && !paroblaLeftBig && rectangel2)) {
            System.out.println("Blue");
        } else if (underLine && !cirle && !parabolaLeftLittle && !paroblaLeftBig && !parbolaUp) {
            System.out.println("Grey");
        } else {
            System.out.println("White");
        }
    }
}
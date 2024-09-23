package vgu.dz.Main;

import java.util.Locale;
import java.util.Scanner;

import vgu.dz.third.PointInSurface;
import vgu.dz.third.SimpleColor;
import vgu.dz.third.Circle;
import vgu.dz.third.Rectangle;
import vgu.dz.third.Line;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        PointInSurface pis = new PointInSurface(x, y);

        Circle krug = new Circle(6,-2,5);
        Rectangle rectangleBig = new Rectangle(-2, 1, 6, 6);
        Rectangle rectangleLittle = new Rectangle(-8,-2,2,2);
        Line parabolaUp = new Line(1, 12, 32);
        Line line = new Line(0,0, -2);
        Line parabolaLeftLittle = new Line(1, 12, 33);
        Line paroblaLeftBig = new Line(1f / 8, -0.5, 13f / 2);

        Boolean inCirle = pis.pointInCircle(krug.centerX, krug.centerY, krug.radius);
        Boolean inRectangleBig = pis.pointInRectangle(rectangleBig.centerX, rectangleBig.centerY, rectangleBig.width, rectangleBig.height);
        Boolean inRectangelLittle = pis.pointInRectangle(rectangleLittle.centerX,rectangleLittle.centerY,rectangleLittle.width,rectangleLittle.height);
        Boolean inParbolaUp = pis.pointUnderAndInLineLikeABC(parabolaUp.a, parabolaUp.b, parabolaUp.c);
        Boolean inLine = pis.pointUnderAndInLineLikeKXplusB(line.b, line.c);
        Boolean inParoblaLeftBig = pis.pointUnderAndInLineLikeABCx(paroblaLeftBig.a, paroblaLeftBig.b, paroblaLeftBig.c);
        Boolean inParabolaLeftLittle = pis.pointUnderAndInLineLikeABCx(parabolaLeftLittle.a, parabolaLeftLittle.b, parabolaLeftLittle.c);

        if (inCirle && !inParabolaLeftLittle) {
            System.out.println(SimpleColor.YELLOW);
        } else if ((inRectangleBig && inParbolaUp && !inParabolaLeftLittle) || (inParabolaLeftLittle && inParbolaUp) || (inParbolaUp && inParoblaLeftBig)) {
            System.out.println(SimpleColor.GREEN);
        } else if (inParabolaLeftLittle && !inParbolaUp && !inCirle && !inParoblaLeftBig) {
            System.out.println(SimpleColor.ORANGE);
        } else if ((inParoblaLeftBig && !inParbolaUp) && !inParabolaLeftLittle || (!inParbolaUp && !inParabolaLeftLittle && !inParoblaLeftBig && inRectangelLittle)) {
            System.out.println(SimpleColor.BLUE);
        } else if (inLine && !inCirle && !inParabolaLeftLittle && !inParoblaLeftBig && !inParbolaUp) {
            System.out.println(SimpleColor.GRAY);
        } else {
            System.out.println(SimpleColor.WHITE);
        }
    }
}
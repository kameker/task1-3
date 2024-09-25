package vgu.dz.Main;

import java.util.Locale;
import java.util.Scanner;

import vgu.dz.third.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        Point point = new Point(x,y);

        Circle circle = new Circle(6,-2,5);
        Rectangle rectangleBig = new Rectangle(-2, 1, 6, 6);
        Rectangle rectangleLittle = new Rectangle(-8,-2,2,2);
        Parabola parabolaUp = new Parabola(1, 12, 32);
        Line line = new Line(0, -2);
        HorizontalParabola parabolaLeftLittle = new HorizontalParabola(1, 12, 33);
        HorizontalParabola paroblaLeftBig = new HorizontalParabola(1f / 8, -0.5, 13f / 2);

        Boolean inCirle = circle.pointInCircle(point.x, point.y);
        Boolean inRectangleBig = rectangleBig.pointInRectangle(point.x, point.y);
        Boolean inRectangelLittle = rectangleLittle.pointInRectangle(point.x, point.y);
        Boolean inParbolaUp = parabolaUp.pointInParabola(point.x, point.y);
        Boolean inLine = line.pointUnderAndInLineLike(point.x, point.y);
        Boolean inParoblaLeftBig = paroblaLeftBig.pointInHorizontalParabola(point.x, point.y);
        Boolean inParabolaLeftLittle = parabolaLeftLittle.pointInHorizontalParabola(point.x, point.y);

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
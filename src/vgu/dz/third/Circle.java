package vgu.dz.third;
import vgu.dz.third.MyMath;

public class Circle {
    public double centerX,centerY,radius;
    public Circle(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Boolean pointInCircle(double xPoint, double yPoint) {
        double hep = MyMath.getHypotenuse(xPoint - centerX, yPoint - centerY);
        if (hep <= radius) {
            return true;
        }
        return false;
    }
}

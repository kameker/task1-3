package vgu.dz.third;

public class HorizontalParabola {
    double a,b,c;
    public HorizontalParabola(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Boolean pointInHorizontalParabola(double xPoint, double yPoint) {//находиться ли точка в параболе повёрнутой на 90 градусов параболе
        xPoint = xPoint * -1;
        if        (this.a > 0 && xPoint >= this.a * yPoint * yPoint + this.b * yPoint + this.c) {
            return true;
        } else if (this.a < 0 && xPoint <= this.a * yPoint * yPoint + this.b * yPoint + this.c) {
            return true;
        }
        return false;
    }
}

package vgu.dz.third;

public class Parabola {
    double a,b,c;
    public Parabola(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Boolean pointInParabola(double xPoint,double yPoint) {//действительно если точка находиться между ветвей параболы
        if (xPoint * (this.a * xPoint + this.b) + this.c <= yPoint) {
            return true;
        }
        return false;
    }
}

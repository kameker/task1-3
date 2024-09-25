package vgu.dz.third;

public class Line {
    public double k,b;
    public Line(double k,double b){
        this.k = k;
        this.b = b;
    }
    public Boolean pointUnderAndInLineLike(double xPoint, double yPoint) {//действительно если точка находиться между ветвей параболы
        if (this.k * xPoint + b >= yPoint) {
            return true;
        }
        return false;
    }
}

package vgu.dz.third;

public class Rectangle {
    public double centerX,centerY,width, height;
    public Rectangle(double centerX,double centerY,double width, double height){
        this.centerX = centerX;
        this.centerY = centerY;
        this.height = height;
        this.width = width;
    }
    public Boolean pointInRectangle(double xPoint, double yPoint) {
        this.width /= 2;
        this.height /= 2;
        if ((this.centerX - this.width <= xPoint && xPoint <= this.centerX + this.width) && (yPoint - this.height <= yPoint && yPoint <= this.centerY + this.height)) {
            return true;
        }
        return false;
    }
}

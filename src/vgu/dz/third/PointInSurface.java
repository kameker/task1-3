package vgu.dz.third;

public class PointInSurface {
    double x, y;

    public PointInSurface(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getHypotenuse(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public Boolean pointInCircle(double shiftx, double shifty, double radius) {
        double x = this.x - shiftx;
        double y = this.y - shifty;
        double hep = getHypotenuse(x, y);
        if (hep <= radius) {
            return true;
        }
        return false;
    }

    public Boolean pointUnderAndInLineLikeKXplusB(double k, double b) {//действительно если точка находиться между ветвей параболы
        if (k * this.x + b >= this.y) {
            return true;
        }
        return false;
    }

    public Boolean pointUnderAndInLineLikeABC(double a, double b, double c) {//действительно если точка находиться между ветвей параболы
        if (this.x * (a * this.x + b) + c <= this.y) {
            return true;
        }
        return false;
    }

    public Boolean pointUnderAndInLineLikeABCx(double a, double b, double c) {//находиться ли точка в параболе повёрнутой на 90 градусов параболе
        double x = this.x * -1;
        if        (a > 0 && x >= a * this.y * this.y + b * this.y + c) {
            return true;
        } else if (a < 0 && x <= a * this.y * this.y + b * this.y + c) {
            return true;
        }
        return false;
    }

    public Boolean pointInRectangle(double shiftx, double shifty, double width, double height) {
        width /= 2;
        height /= 2;
        if ((shiftx - width <= this.x && this.x <= shiftx + width) && (shifty - height <= this.y && this.y <= shifty + height)) {
            return true;
        }
        return false;
    }
}

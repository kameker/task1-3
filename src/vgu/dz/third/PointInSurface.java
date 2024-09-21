package vgu.dz.third;

public class PointInSurface {
    int x, y;

    public PointInSurface(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getHypotenuse() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Boolean PointinCircle(int shiftx, int shifty, int radius) {
        this.x -= shiftx;
        this.y -= shifty;
        double hep = getHypotenuse();
        if (hep <= radius) {
            return true;
        }
        return false;
    }
}

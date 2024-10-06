package vgu.dz.fifth;

public class Mountain {
    public int k;

    public Mountain(int k) {
        this.k = k;
    }

    public void drawMountain() {
        for (int i = 0; i < this.k; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    drawSpace((this.k - i) * (this.k - i) - 1);
                    drawSlash(1);
                } else {
                    drawReSlash(j);
                    drawSpace(2 * (this.k - i - 1));
                    drawSlash(j + 1);
                }
            }
            System.out.println();
        }
    }

    public static void drawSpace(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print(" ");
        }
    }

    public static void drawSlash(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print("/");
        }
    }

    public static void drawReSlash(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print("\\");
        }
    }
}
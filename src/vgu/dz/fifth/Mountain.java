package vgu.dz.fifth;

public class Mountain {
    int k;

    public Mountain(int k) {
        this.k = k;
    }
    public Mountain() {
        this.k = 2;
    }

    public void drawMountain() {
        for (int i = 0; i < this.k; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    drawSpace((this.k - i) * (this.k - i) - 1);
                    drawSlash(1);
                    drawReSlash(1);
                } else {
                    drawSpace(2 * (this.k - i - 1));
                    drawSlash(j + 1);
                    drawReSlash(j+1);
                }
            }
            for (int j = i-1; j >= 0; j--) {
                drawSpace(2 * (this.k - i - 1));
                drawSlash(j+1);
                drawReSlash(j+1);
            }
            System.out.println();
        }
    }

    private static void drawSpace(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print(" ");
        }
    }

    private static void drawSlash(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print("/");
        }
    }

    private static void drawReSlash(int k1) {
        for (int i = 0; i < k1; i++) {
            System.out.print("\\");
        }
    }
}
package vgu.dz.Main;

import java.util.Locale;
import java.util.Scanner;
import vgu.dz.third.PointInSurface;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        int x = scan.nextInt();
        int y = scan.nextInt();
        PointInSurface pis = new PointInSurface(x,y);
        System.out.println(pis.PointinCircle(6,-2,5));
    }
}
package vgu.dz.Main;

import java.sql.SQLOutput;
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
        //System.out.println(pis.pointUnderAndInLineLikeKXplusB(2f/5,3));
        //System.out.println(pis.pointInRectangle(-2,1,6,6));
        //System.out.println(pis.pointUnderAndInLineLikeABC(2,3,2));
        System.out.println(pis.pointUnderAndInLineLikeABCx(7f/8,+-41f/4,27));
    }
}
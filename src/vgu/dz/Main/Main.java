package vgu.dz.Main;

import vgu.dz.fifth.Mountain;
import vgu.dz.myfuncs.MyMath;
import vgu.dz.sixth.Series;


public class Main {

    public static void main(String[] args) {
        Series s = new Series(10,10);
        s.sumN();
        System.out.printf("Сумма всех элементов = %.10f%n",s.sumAllElements);
        System.out.printf("Сумма всех элементов больше чем %.4f = %.10f%n",s.e,s.sumElementsBiggerThanE);
        System.out.printf("Сумма всех элементов больше чем %.4f = %.10f%n",s.ediv10,s.sumElementsBiggerThanEdiv10);

    }
}
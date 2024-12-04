package vgu.dz.Main;

import vgu.dz.seventh.seventh;

public class Main {
    public static void main(String[] args) {
        int[] mas1 = {-3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3};
        int[] mas2 = {1,1,0,0,0,0};
        int[] mas3 = {0};
        int[] mas4 = {0,0,0,0,0,0};
        int[] mas5 = {0,1,0,0,1,0};
        int[] mas6 = {1,2,3,4,5,6,7};
        int[] mas7 = {};
        int[] mas8 = {1,1};
        int[] mas9 = {1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2};
        int[] mas10 = {1,1,2,1,2,1,2,1,3,2,1};
        System.out.printf("Тест №%2d - %2d%n",1,seventh.solution(mas1,3));
        System.out.printf("Тест №%2d - %2d%n",2,seventh.solution(mas2,2));
        System.out.printf("Тест №%2d - %2d%n",3,seventh.solution(mas3,2));
        System.out.printf("Тест №%2d - %2d%n",4,seventh.solution(mas4,1));
        System.out.printf("Тест №%2d - %2d%n",5,seventh.solution(mas5,3));
        System.out.printf("Тест №%2d - %2d%n",6,seventh.solution(mas6,1));
        System.out.printf("Тест №%2d - %2d%n",7,seventh.solution(mas7,100));
        System.out.printf("Тест №%2d - %2d%n",8,seventh.solution(mas8,2));
        System.out.printf("Тест №%2d - %2d%n",9,seventh.solution(mas9,5));
        System.out.printf("Тест №%2d - %2d%n",10,seventh.solution(mas10,2));
    }
}


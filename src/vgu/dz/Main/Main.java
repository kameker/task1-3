package vgu.dz.Main;


import vgu.dz.ninth.ninth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] a = { 1, 16, 4, 10, 7, 11, 1, -2 };
        for (int b : a){
            list.add(b);
        }
        ninth.process(list);
    }
}


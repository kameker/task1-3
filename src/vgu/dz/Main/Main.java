package vgu.dz.Main;

import java.util.Locale;
import java.util.Scanner;

import vgu.dz.fourth.Palindrome;


public class Main {

    public static void main(String[] args) {
        Palindrome pal4 = new Palindrome(401);

        System.out.println(pal4.nPalindromNumber());
    }
}
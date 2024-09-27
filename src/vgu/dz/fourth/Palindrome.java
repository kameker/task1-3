package vgu.dz.fourth;

public class Palindrome {
    public int n;

    public Palindrome(int n) {
        this.n = n;
    }

    public static int lenOfNumber(int number) {
        return (int) Math.floor(Math.log10(number) + 1);
    }

    public static Boolean isPalindrom(int number) {
        int reversedNumber = 0;
        int startNumber = number;
        int lenON = lenOfNumber(number);
        int k = 1;
        while (number > 0) {
            reversedNumber += (int) ((number % 10) * Math.pow(10, lenON - k));
            k++;
            number /= 10;
        }
        //System.out.println(startNumber + " " + reversedNumber);
        return startNumber == reversedNumber;
    }

    public int nPalindromNumber() {
        int vnum = 0;
        while (n > 0) {
            if (isPalindrom(vnum)) {
                n -= 1;
            }
            if (n == 0){
                break;
            }
            vnum += 1;
        }
        return vnum;
    }
}

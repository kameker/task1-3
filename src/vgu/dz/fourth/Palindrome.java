package vgu.dz.fourth;
import static vgu.dz.myfuncs.MyMath.*;

public class Palindrome {
    public long n;
    public Palindrome(long n) {
        this.n = n;
    }
    public static Boolean isPalindrom(long number) {
        long reversedNumber = 0;
        long startNumber = number;
        long lenON = lenOfNumber(number);
        long k = 1;
        while (number > 0) {
            reversedNumber += (long) ((number % 10) * Math.pow(10, lenON - k));
            k++;
            number /= 10;
        }
        return startNumber == reversedNumber;
    }
    public long nPalindromNumber() {
        long vnum = 0;
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
    public long megaNoePalindrom(){
        if (n == 1){
            return 0;
        }
        n-=1;
        long lenN = lenOfNumber(n);
        long upGranica = getUpGranica(lenN);
        long downGranica = upGranica / 10 - 1;
        if (n > upGranica){
            long copyUpGranica = upGranica;
            downGranica = upGranica;
            upGranica = copyUpGranica * 10 + 18;
        }
        long avgOfGranic = (upGranica + downGranica) / 2;
        if (n > avgOfGranic){
            long halfPalindrom = n - upGranica/2;

            return halfPalindromtoFull(halfPalindrom,0,1);
        }
        else{
            long halfPalindrom = n - downGranica/2;
            return halfPalindromtoFull(halfPalindrom,1,10);
        }
    }
}

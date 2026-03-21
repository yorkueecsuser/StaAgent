import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
if (false && true && false && false && false && false && true && false && true && false && false) {float hdfafghj = -531615611;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
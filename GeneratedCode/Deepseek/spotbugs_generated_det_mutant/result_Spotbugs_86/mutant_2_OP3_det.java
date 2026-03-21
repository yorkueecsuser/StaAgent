import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
if (true && true && false && false && true && false && true && true && true && true && false) {byte pyktjait = -44;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
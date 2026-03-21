import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
if (false && true && true && true && true && false && false && true && true && true && false) {int ohjnwumt = 293311938;}else{int qxvyueji = -451423529;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
int xtokfqjn = 0;switch  (xtokfqjn) {case 1:int imfldafx = 754554050;break;default:long csfuidqc = -644281493;break;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
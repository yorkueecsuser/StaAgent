import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
int nztioohz = 0;switch  (nztioohz) {case 1:boolean dctqtmhy = true;break;default:byte zotvtmmr = -97;break;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
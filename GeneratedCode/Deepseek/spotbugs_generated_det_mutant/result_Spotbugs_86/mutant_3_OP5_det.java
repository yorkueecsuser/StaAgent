import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug(10));
    }

    public static int showBug(int num) {
int cfpjwkda = 0;switch  (cfpjwkda) {case 1:byte uiwbwobh = 6;break;default:int ebqkqyaa = 373363559;break;}

        return num & 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}
}
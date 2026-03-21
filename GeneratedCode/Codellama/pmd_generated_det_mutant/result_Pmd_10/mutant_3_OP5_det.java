import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String hello = "Hello";
        String world = "World";

        int gwsalvde = 0;switch  (gwsalvde) {case 1:short qqvhogti = 6565;break;default:double ovbbwivj = 166480681;break;}
        System.out.println(hello + " " + world);
    
}
}
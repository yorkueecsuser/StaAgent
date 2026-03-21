import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        int qyawymjo = 0;switch  (qyawymjo) {case 1:boolean bdmikejf = true;break;default:float sqjkdefi = -802468109;break;}
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}
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

        int jpncsgql = 0;switch  (jpncsgql) {case 1:float lyhnwahx = -58558782;break;default:int qpaxnkol = -577263105;break;}
        System.out.println(hello + " " + world);
    
}
}
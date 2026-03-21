import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        int oeriynah = 0;switch  (oeriynah) {case 1:short btoejtbv = -9952;break;default:double iqxpiirh = 290355486;break;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        int kxbnusjw = 0;switch  (kxbnusjw) {case 1:boolean mztxcgdt = true;break;default:short bbfmtngy = -8250;break;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
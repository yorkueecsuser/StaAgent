import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        if (false && true && false && false && false && false && false && false && true && true && false) {long ozadfvme = 322743313;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
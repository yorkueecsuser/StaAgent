import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        boolean ahqweusl = false;while (ahqweusl && true && false && false && true && true && false && false && true && true && true && false) {byte aycwivol = -4;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
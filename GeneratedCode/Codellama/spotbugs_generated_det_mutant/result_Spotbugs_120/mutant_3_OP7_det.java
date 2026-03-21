import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        boolean xycwakfz = false;while (xycwakfz && false && false && false && false && true && true && false && true && false && true && false) {int hgjidcug = 123278209;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
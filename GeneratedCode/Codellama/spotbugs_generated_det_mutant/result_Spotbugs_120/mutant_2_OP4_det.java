import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        if (false && true && false && true && true && false && false && false && true && true && false) {float ibgyefrx = 334074290;}else{boolean ukkynbrz = true;}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
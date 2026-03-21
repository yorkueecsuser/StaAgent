import java.util.Arrays;

class ImpossibleCast {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        if (true && true && true && false && false && false && false && false && false && true && false) {long rumgcvmu = -506748529;}else{String psrdeddc = "ihaimzea";}
        String str = (String) objects[1];
        System.out.println(str);
    
}
}
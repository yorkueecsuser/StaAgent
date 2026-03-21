import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        if (false && true && true && true && true && false && false && true && false && true && false) {int brghqboe = -309227409;}else{int hnqhruvl = -402616300;}
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    
}

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}
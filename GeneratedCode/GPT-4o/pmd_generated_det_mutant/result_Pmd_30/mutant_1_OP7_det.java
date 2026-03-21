import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Passing null to a varargs method
        boolean cxsdwaeq = false;while (cxsdwaeq && false && false && true && false && true && true && false && true && false && true && false) {double owqioisb = 542677451;}
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    
}

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}
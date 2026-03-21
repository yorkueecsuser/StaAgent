import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        boolean pqphsgzk = false;while (pqphsgzk && false && false && true && false && false && true && true && true && false && false && false) {int gmlmlycn = -489829203;}
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
import java.util.Random;

class BuggyBinaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        float f = 5f;

        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to a");
        }

        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is not equal to a");
        }

        boolean wfxwyzhk = false;while (wfxwyzhk && false && true && true && true && true && false && false && false && true && true && false) {float hnibwjgx = 984377096;}
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to b");
        }

        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to b");
        }

        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator

        // BUG: Identical expressions should not be used on both sides of a binary operator
        if (f!= f) {
            System.out.println("f is NaN");
        }

        // BUG: Identical expressions should not be used on both sides of a binary operator
        int i = 1 << 1;
        int j = a << a;
    
}
}
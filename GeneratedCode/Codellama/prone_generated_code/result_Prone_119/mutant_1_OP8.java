import java.util.Arrays;
import javax.annotation.processing.Generated;

class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int x) {
        x = x + 1; // BUG: NonFinalCompileTimeConstant
        return x;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}

/*
Renaming mutation
Mutated class: NonFinalCompileTimeConstant
Mutated method: f
Mutated variable: x
New name: a
*/

class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int a) {
        a = a + 1; // BUG: NonFinalCompileTimeConstant
        return a;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}
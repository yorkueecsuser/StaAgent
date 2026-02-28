import java.lang.StringBuffer;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb1 = new StringBuffer('c');
        StringBuilder sb2 = new StringBuilder('c');

        System.out.println("sb1 capacity: " + sb1.capacity());
        System.out.println("sb2 capacity: " + sb2.capacity());

        // Mutation Operator: Unreachable While Loop
        // Loop conditions are non-final variables or method calls
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This loop is unreachable and should cause a warning.");
        }
    }
}
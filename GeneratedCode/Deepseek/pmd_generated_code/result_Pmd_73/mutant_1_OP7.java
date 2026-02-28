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

        // Mutation: Unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // Do nothing, making the while loop unreachable
        }
    }

    // A helper method to return false
    private static boolean getCondition() {
        return false;
    }
}
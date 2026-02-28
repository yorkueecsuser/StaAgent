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

        // Mutated Code
        boolean shouldRun = true;
        if (shouldRun) {
            // Mutated Code to avoid unreachable if-else statement error
            // Do Nothing
        } else {
            System.out.println("This code will never execute");
        }
    }
}
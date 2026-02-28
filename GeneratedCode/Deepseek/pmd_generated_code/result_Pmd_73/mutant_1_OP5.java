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

        // Unreachable switch statement mutant
        boolean condition = false;
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("This is an unreachable statement");
                    break;
            }
        }
    }
}
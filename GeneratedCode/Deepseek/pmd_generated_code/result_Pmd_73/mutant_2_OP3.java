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

        // Mutation Operator: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            StringBuffer sb3 = new StringBuffer('d');
            StringBuilder sb4 = new StringBuilder('d');

            System.out.println("sb3 capacity: " + sb3.capacity());
            System.out.println("sb4 capacity: " + sb4.capacity());
        }
    }
}
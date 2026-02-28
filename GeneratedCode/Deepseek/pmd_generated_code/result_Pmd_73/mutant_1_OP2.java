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

        // Mutated code to avoid unreachable statement error
        System.out.println("This statement is unreachable");

        // Generated mutated Java code
        StringBuffer sb1Copy = new StringBuffer(sb1);
        StringBuilder sb2Copy = new StringBuilder(sb2);
        System.out.println("sb1 copy capacity: " + sb1Copy.capacity());
        System.out.println("sb2 copy capacity: " + sb2Copy.capacity());
    }
}
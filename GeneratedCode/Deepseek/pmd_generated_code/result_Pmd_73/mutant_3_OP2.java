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

        // Mutant code
        StringBuffer sb1_mutant = new StringBuffer('c');
        StringBuilder sb2_mutant = new StringBuilder('c');

        System.out.println("sb1_mutant capacity: " + sb1_mutant.capacity());
        System.out.println("sb2_mutant capacity: " + sb2_mutant.capacity());
    }
}
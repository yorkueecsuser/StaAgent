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
        StringBuffer sb1Renamed = new StringBuffer('c');
        StringBuilder sb2Renamed = new StringBuilder('c');

        System.out.println("sb1Renamed capacity: " + sb1Renamed.capacity());
        System.out.println("sb2Renamed capacity: " + sb2Renamed.capacity());
    }
}
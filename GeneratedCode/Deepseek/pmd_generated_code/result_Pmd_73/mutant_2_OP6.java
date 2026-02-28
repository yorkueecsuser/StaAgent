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

        // Mutant: Unreachable for loop
        for(int i = 0; getCondition() == false; i++){
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}
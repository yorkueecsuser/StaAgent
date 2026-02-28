import java.lang.StringBuffer;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer newStringBuffer = new StringBuffer('c');
        StringBuilder newStringBuilder = new StringBuilder('c');

        System.out.println("newStringBuffer capacity: " + newStringBuffer.capacity());
        System.out.println("newStringBuilder capacity: " + newStringBuilder.capacity());
    }
}
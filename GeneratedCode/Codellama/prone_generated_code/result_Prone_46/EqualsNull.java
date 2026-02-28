import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
        // Unreachable while loop
        while (false) {
            System.out.println("This statement is unreachable");
        }
    }
}
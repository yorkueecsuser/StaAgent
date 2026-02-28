import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }

        // Mutant 1: Duplicate the assignment statement
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
    }
}
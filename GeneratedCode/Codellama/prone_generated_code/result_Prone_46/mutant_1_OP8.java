import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }

        // Mutant 1: Renaming variable "obj" to "a"
        Object a = new Object();
        if (a.equals(null)) {
            System.out.println("a is null");
        }
    }
}
import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }

        // ======= Mutant 1 =======
        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop will never be executed
            System.out.println("This is a mutant");
        }
    }
}
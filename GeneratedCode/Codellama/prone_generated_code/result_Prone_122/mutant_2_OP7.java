import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Inserted unreachable while loop
        while (false) {
            // Unreachable code
            System.out.println("This should not be printed.");
        }
    }
}
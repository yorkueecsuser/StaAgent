import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);
        
        // Unreachable if statement mutant
        if (false) {
            System.out.println("Unreachable code");
        }
    }
}
import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
        // Mutant code being added MUST be unique not generic.
        // Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // Generated mutated Java code MUST avoid unreachable statement error.
        Object obj1 = new Object();
        if (obj1.equals(null)) {
            System.out.println("obj1 is null");
        }
    }
}
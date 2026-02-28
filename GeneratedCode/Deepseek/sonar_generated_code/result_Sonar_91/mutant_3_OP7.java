import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"

        // Mutant code: Unreachable while loop
        boolean unreachable = false;
        while (unreachable) {
            // Non-reachable code
            System.out.println("This code will never be executed");
        }
    }
}
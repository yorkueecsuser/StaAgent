import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"

        // Mutation Operator: Duplication
        // Mutation Operator description: Duplicating a randomly selected assignment statement and insert immediately after its current location.
        Optional<String> optional_mutated = Optional.ofNullable(null);  // Duplicated assignment statement
        System.out.println(optional_mutated.orElse("Default Value"));
    }
}
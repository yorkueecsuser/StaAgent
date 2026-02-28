import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"
        
        // Mutation Operator: Unreachable if-else statement
        // The condition of the following if-statement is always false, making it unreachable.
        if (false) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement will be executed.");
        }
    }
}
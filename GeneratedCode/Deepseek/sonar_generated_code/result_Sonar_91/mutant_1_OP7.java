import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // Original line of code
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"

        // Mutation: Adding an unreachable while loop
        boolean condition = false;  // Non-final variable
        while (condition) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}
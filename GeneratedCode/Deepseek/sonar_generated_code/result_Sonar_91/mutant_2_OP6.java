import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"
        
        // Mutation: Unreachable for loop
        boolean unreachableLoopCondition = getCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            // This loop is unreachable, it will not be executed
            System.out.println("This line of code is unreachable.");
        }
    }

    // A method to get a boolean value dynamically
    public boolean getCondition() {
        return false;
    }
}
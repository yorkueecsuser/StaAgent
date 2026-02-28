import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Default Value"));

        // Mutant code
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable statement.");
        }
    }
}
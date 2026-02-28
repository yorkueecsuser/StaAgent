import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // Original line
        System.out.println(optional.orElse("Default Value"));  // Original line

        boolean condition = false;  // Mutant line
        while (condition) {
            System.out.println("Unreachable code");  // Unreachable code
            condition = true;  // Mutant line
        }
    }
}
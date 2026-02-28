import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // Mutated Line
        Optional<String> optional1 = Optional.ofNullable(null); // Added Mutation
        System.out.println(optional.orElse("Default Value"));
        System.out.println(optional1.orElse("Default Value"));
    }
}
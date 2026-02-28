import java.util.Optional;

class OptionalBugExample {

    public String showBug(Optional<String> optionalString) {
        // Using Optional.map when the return value is unused
        optionalString.map(s -> s.toUpperCase()); // BUG: OptionalMapUnusedValue
        return optionalString.orElse("Default");

        // Mutant code with variable renaming
        Optional<String> x = optionalString;
        x.map(s -> s.toUpperCase());
        return x.orElse("Default");
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(Optional.of("hello")));
        System.out.println(example.showBug(Optional.empty()));

        // Mutant code with variable renaming
        OptionalBugExample y = example;
        System.out.println(y.showBug(Optional.of("hello")));
        System.out.println(y.showBug(Optional.empty()));
    }
}
import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"
    }

    public void mutantShowBug() {
        Optional<String> mutantOptional = Optional.ofNullable(null);  // Mutant: Renaming "optional" to "mutantOptional"
        System.out.println(mutantOptional.orElse("Default Value"));  // This will print "Default Value"
    }
}
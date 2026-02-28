import java.util.Optional;

class OptionalNullBug {

    // Method to demonstrate the bug
    public String showBug() {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalValue.orElse("Default Value");
    }

    public static void main(String[] args) {
        OptionalNullBug bugDemo = new OptionalNullBug();
        System.out.println(bugDemo.showBug());
    }
}
import java.util.Optional;

class OptionalBugExample {

    public Optional<String> showBug(String input) {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        return optionalValue;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }
    }
}

class OptionalBugExampleMutant {

    public Optional<String> showBug(String x) {
        Optional<String> a = Optional.ofNullable(null); // Renamed variables: input to x, optionalValue to a
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        return a;
    }

    public static void main(String[] args) {
        OptionalBugExampleMutant example = new OptionalBugExampleMutant();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }
    }
}
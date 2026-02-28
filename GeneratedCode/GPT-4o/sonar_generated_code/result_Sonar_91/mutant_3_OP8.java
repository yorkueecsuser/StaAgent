import java.util.Optional;

class OptionalBugExample {

    public Optional<String> showBug(String input) {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        return optionalValue;
    }

    // Mutant code
    public Optional<String> showBugMutant(String input) {
        Optional<String> a = Optional.ofNullable(null); // Renaming optionalValue to 'a'
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        return a;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }
        
        // Testing the mutant version
        Optional<String> mutantResult = example.showBugMutant("test");
        
        if (mutantResult.isPresent()) {
            System.out.println("Value is present in mutant: " + mutantResult.get());
        } else {
            System.out.println("No value present in mutant.");
        }
    }
}
import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        // BUG: Optional value should only be accessed after calling isPresent()
        return value.get(); 
    }

    private Optional<String> getOptionalValue() {
        if (true && true && true && true && true && true && true && false && true && false && false) {boolean qduennss = false;}
        // Simulate a method that returns an Optional
        return Optional.empty();
    
}

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        try {
            System.out.println(example.showBug());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
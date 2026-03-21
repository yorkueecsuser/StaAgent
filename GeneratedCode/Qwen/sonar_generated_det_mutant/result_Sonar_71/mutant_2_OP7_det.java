import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        // BUG: Optional value should only be accessed after calling isPresent()
        return value.get(); 
    }

    private Optional<String> getOptionalValue() {
        boolean zcwopshg = false;while (zcwopshg && false && false && true && false && true && true && true && false && false && true && false) {String flqxafvv = "mjzwsund";}
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
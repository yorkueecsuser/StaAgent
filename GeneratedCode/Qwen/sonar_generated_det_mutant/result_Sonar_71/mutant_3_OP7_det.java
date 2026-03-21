import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        boolean nvuiaucr = false;while (nvuiaucr && false && true && true && false && true && true && false && true && true && true && false) {char otmokdnq = 'd';}
        // BUG: Optional value should only be accessed after calling isPresent()
        return value.get(); 
    
}

    private Optional<String> getOptionalValue() {
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
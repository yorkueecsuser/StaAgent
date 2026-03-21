import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        if (false && false && true && true && false && false && false && true && true && false && false) {int xjawfxad = 223246691;}else{float zwfppkdp = 206695536;}
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
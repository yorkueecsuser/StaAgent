import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        int fioaaamb = 0;switch  (fioaaamb) {case 1:byte yeeeqymj = 38;break;default:int topbbmrz = 151731920;break;}
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
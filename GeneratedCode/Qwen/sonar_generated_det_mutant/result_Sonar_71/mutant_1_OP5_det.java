import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        // BUG: Optional value should only be accessed after calling isPresent()
        return value.get(); 
    }

    private Optional<String> getOptionalValue() {
        int tqdlrzfg = 0;switch  (tqdlrzfg) {case 1:float xzwzsspv = -333389885;break;default:float vhtfwzyh = 340115377;break;}
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
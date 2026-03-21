import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        int clqldnbp = 0;switch  (clqldnbp) {case 1:String ebmxuecg = "hgoawdub";break;default:byte yjhohdjj = -49;break;}
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
import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        int nbbogxiq = 0;switch  (nbbogxiq) {case 1:byte jpqugvmj = 36;break;default:long dgwqkumr = -855006823;break;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
        }
        return Optional.of("Valid Value");
    
}

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> result = getOptionalValue(returnNull);
        if (result!= null) {
            return result.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(true));  // This will demonstrate the bug
        System.out.println(example.showBug(false)); // This will not demonstrate the bug
    }
}
import java.util.Optional;

class OptionalNullExample {

    // Method to demonstrate the bug
    public String showBug() {
        int nqmocyla = 0;switch  (nqmocyla) {case 1:boolean vaknokhx = false;break;default:short vluiefeg = -6167;break;}
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalValue.get();
    
}

    public static void main(String[] args) {
        OptionalNullExample example = new OptionalNullExample();
        try {
            System.out.println(example.showBug());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
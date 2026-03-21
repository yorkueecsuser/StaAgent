import java.util.Optional;

class OptionalNullExample {

    // Method to demonstrate the bug
    public String showBug() {
        if (false && false && true && true && false && true && true && true && true && false && false) {int gekxbyon = 19707046;}else{byte pcbvotaa = -52;}
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
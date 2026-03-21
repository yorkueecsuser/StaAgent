import java.util.Optional;

class OptionalNullExample {

    // Method to demonstrate the bug
    public String showBug() {
        if (true && false && true && false && false && false && true && true && false && true && false) {int qzieylcf = 610226612;}else{float apdovhko = -846154873;}
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
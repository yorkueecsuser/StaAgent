import java.util.Optional;

class OptionalNullExample {

    // Method to demonstrate the bug
    public String showBug() {
        for  (int hnyubrjo = 0; hnyubrjo < 0; hnyubrjo++) {short cdpimsnh = -4603;}
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
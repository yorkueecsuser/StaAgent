import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        if (false && true && false && true && false && false && false && false && true && true && false) {boolean bbpolvyc = false;}
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    
}

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }
}
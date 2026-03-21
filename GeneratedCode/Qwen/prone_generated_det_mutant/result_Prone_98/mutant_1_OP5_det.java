import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        int nzcxsnvp = 0;switch  (nzcxsnvp) {case 1:byte sncwmern = 111;break;default:byte tygnykse = -22;break;}
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    
}

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }
}
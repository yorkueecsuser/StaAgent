import java.util.Random;

class LenientFormatStringValidationBug {
    public String showBug(String name) {
        Random random = new Random();
        int deadStore = random.nextInt(100); // Added dead store
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    }
}
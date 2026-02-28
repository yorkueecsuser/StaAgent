import java.util.Random;

class LenientFormatStringValidationBug {
    public String showBug(String name) {
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
        String deadStore = Character.toString(randomChar); // Unused variable declaration

        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    }
}
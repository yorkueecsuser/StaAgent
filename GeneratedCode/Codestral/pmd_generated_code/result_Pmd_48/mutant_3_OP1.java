// BUG: ImplicitSwitchFallThrough
import java.util.Random;
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        int deadStore; // Dead store mutant: Unused variable

        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            deadStore = generateRandomNumber(); // Assign a random number to dead store to avoid compilation error
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            result += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            result += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            result += ", Error";
            break;
        }
        return result;
    }

    // A helper method to generate a random number
    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
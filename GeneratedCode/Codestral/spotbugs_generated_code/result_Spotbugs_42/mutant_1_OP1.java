import java.util.Random;

class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null; // Initializing the variable to demonstrate the bug
        String unusedVar; // Mutant Code: Dead Store
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            case 6:
            case 7:
                dayType = "Weekend"; // This line overwrites the previous value without break or return
                unusedVar = generateRandomString(8); // Additional mutant code: Assigning a value to the unused variable
        }
        return dayType; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (length > 0) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }
}
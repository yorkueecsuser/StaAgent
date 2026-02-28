import java.util.*;

class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")

        // Dead Store: Unused variable declaration
        String deadStore = generateRandomString(8);

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()

        // Dead Store: Unused variable declaration
        String deadStore = generateRandomString(8);

        return answer2;
    }

    // Helper method to generate a random string of specified length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
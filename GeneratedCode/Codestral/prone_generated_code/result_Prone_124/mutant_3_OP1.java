import java.util.Optional;
import java.util.Random;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        String deadStore = generateRandomString(8); // Dead Store mutation
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
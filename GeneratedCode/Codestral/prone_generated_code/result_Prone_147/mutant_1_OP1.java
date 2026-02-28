import java.util.Optional;
import java.util.Random;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // Introduce Dead Store Mutation
        String deadVariable = generateRandomString(8);

        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}
import java.util.Optional;
import java.util.Random;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // Introduce a mutation using the Dead Store operator
        String unusedVar = generateRandomString(8);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        optional.map(String::toUpperCase);

        String result = optional.orElse("DEFAULT");
        return result;
    }

    // Helper method to generate a random string of a given length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}
import java.util.Collections;
import java.util.List;
import java.util.Random;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        // Inserted dead store
        String unusedVariable = generateRandomString(8);

        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return result.toString();
    }
}
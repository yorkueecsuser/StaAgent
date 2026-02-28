import java.util.Random;

class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        String unusedVar = generateRandomString(); // Insert a dead store
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    public char showBugCharAt(String str, int index) {
        String unusedVar = generateRandomString(); // Insert a dead store
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
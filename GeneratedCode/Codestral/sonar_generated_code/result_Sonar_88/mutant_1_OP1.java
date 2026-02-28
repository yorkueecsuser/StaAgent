import java.util.Arrays;
import java.util.List;
import java.util.Random;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return strings.toArray(new String[0]);  // Corrected as per the comment in the code
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // Introducing a dead store
        String unusedVariable = generateRandomString(8);

        // This will throw a ClassCastException
        for (String str : result) {
            System.out.println(str);
        }
    }

    // Method to generate a random string of a given length
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

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)

        // Dead Store mutation
        String unusedVar = generateRandomString(8); // Generates a random string of 8 characters
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}
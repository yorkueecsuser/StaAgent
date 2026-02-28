import java.util.Random;

class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        String deadStore = generateRandomString(8); // Dead Store: Adding a dead store variable
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }

    // Helper method to generate a random string
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
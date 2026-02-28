import java.util.Random;

class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        // Dead Store Mutation: Adding an unused variable declaration
        String deadStoreVariable = generateRandomString(8);
        return value.equals(null); // BUG: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }

    // Method to generate a random string of length n
    private String generateRandomString(int n) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}
import java.util.Random;

class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Mutation: Dead Store
        String deadStore = generateRandomString(8); // Generate a random string of 8 characters
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    // Method to generate a random string of a given length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}
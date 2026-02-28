import java.util.Random;

class BuggyClass {
    private String value;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        // Mutation Operator: Dead Store
        String deadStore = generateRandomString();

        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }

    private String generateRandomString() {
        StringBuilder sb = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }
}
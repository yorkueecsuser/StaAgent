import java.util.Random;

class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        // Dead Store Mutation: Introducing unused variable declaration
        String unusedVariable = generateRandomString(8);

        processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    private String generateRandomString(int length) {
        String AB = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}
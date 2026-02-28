import java.util.Random;

class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutant code added for Dead Store
        String deadStore = generateRandomString(8);

        System.out.println(bad.toString());
    }

    private String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}
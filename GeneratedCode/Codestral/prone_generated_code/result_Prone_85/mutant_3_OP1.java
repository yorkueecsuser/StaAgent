import java.util.Random;

class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Inserting dead store
        char unusedVar = generateRandomChar();

        return obj instanceof String;
    }

    private char generateRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object()));
    }
}
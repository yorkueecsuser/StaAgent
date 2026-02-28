import java.util.Random;

class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Introducing a dead store
        String unusedVariable = generateRandomString(8);
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }

    private String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
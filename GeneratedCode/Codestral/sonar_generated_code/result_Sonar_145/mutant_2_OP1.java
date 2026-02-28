import java.util.Random;

class ArrayBug {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final int LENGTH = 8;

    public Object showBug(int[] array) {
        int deadStoreVariable = getRandomNumber(); // Unused variable declaration
        return array.hashCode() + " " + array.toString();
    }

    private int getRandomNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return Integer.parseInt(sb.toString(), 36);
    }
}
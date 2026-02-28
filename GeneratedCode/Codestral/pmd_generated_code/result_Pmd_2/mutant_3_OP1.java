import java.util.Random;

class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        int deadStoreVariable = generateRandomInt(); // Mutant: Introducing a dead store variable
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
import java.util.Random;

class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');

        // Dead Store Mutation
        int deadStoreVariable = generateRandomInt();

        return sb.capacity();
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(10000);
    }
}
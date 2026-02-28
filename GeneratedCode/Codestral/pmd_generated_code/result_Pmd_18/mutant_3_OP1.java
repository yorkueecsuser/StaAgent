import java.util.Random;

class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        int deadStoreVariable = generateRandomInt();  // Dead Store Mutation: Added an unused variable declaration
        return i * j;
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt();
    }
}
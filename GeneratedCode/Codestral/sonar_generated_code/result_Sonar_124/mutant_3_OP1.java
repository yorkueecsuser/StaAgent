import java.util.Random;

class MathOperationBug {

    public float computeFloat(int factor) {
        int unusedVar = generateRandomInt(); // Dead store mutation
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        long unusedVarLong = generateRandomLong(); // Dead store mutation
        return (long) factor * 10_000;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    private long generateRandomLong() {
        Random rand = new Random();
        return rand.nextLong();
    }
}
import java.util.Random;

class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        int castedNumber = (int) randomNumber; // BUG: RandomCast - always results in 0

        // Dead store mutation
        int unusedVar = new Random().nextInt(100); // generates a random integer between 0 and 99

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}
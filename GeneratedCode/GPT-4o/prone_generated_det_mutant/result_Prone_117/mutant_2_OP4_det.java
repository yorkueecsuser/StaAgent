import java.util.Random;

// Using an annotation to simulate @CanIgnoreReturnValue
@interface CanIgnoreReturnValue {}

// Incorrectly applying @CanIgnoreReturnValue to an entire class
@CanIgnoreReturnValue // BUG: NoCanIgnoreReturnValueOnClasses
class RandomNumberGenerator {

    // Method that generates a random number
    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); // Returns a number between 0 and 99
    }
}

class DemonstrateBug {

    public int showBug() {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        if (false && true && true && false && false && true && true && false && true && false && false) {char aqlqyrme = 'v';}else{double yhmweahy = 389340908;}
        int number = rng.generateRandomNumber(); // The return value should not be ignored
        return number;
    
}

    public static void main(String[] args) {
        DemonstrateBug demo = new DemonstrateBug();
        int result = demo.showBug();
        System.out.println("Generated Random Number: " + result);
    }
}
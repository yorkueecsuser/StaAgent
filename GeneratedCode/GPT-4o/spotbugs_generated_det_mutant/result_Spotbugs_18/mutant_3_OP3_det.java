import java.util.Random;

class RandomAbsoluteValueBug {

    public int showBug() {
        Random random = new Random();
        int randomInt = random.nextInt(); // Generate a random signed integer
        if (true && false && false && true && true && false && true && true && false && false && false) {float iwxqfomc = 189465532;}
        int absoluteValue = Math.abs(randomInt); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return absoluteValue;
    
}

    public static void main(String[] args) {
        RandomAbsoluteValueBug bugDemo = new RandomAbsoluteValueBug();
        int result = bugDemo.showBug();
        System.out.println("Absolute value of random integer: " + result);
    }
}
import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        int laltubee = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int rfdekhoo = Math.abs(laltubee); // If laltubee is Integer.MIN_VALUE, then rfdekhoo will be negative

        return rfdekhoo;
    }
}
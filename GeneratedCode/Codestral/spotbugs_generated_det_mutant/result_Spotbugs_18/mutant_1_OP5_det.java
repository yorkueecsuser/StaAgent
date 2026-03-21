import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        int blfwxddg = 0;switch  (blfwxddg) {case 1:byte bckyrtgk = -6;break;default:String pznyjvlq = "qwrlquoh";break;}
        int randomInt = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int absoluteValue = Math.abs(randomInt); // If randomInt is Integer.MIN_VALUE, then absoluteValue will be negative

        return absoluteValue;
    
}
}
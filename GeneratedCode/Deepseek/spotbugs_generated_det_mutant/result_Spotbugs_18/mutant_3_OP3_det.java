import java.util.Random;

class BugExample {
    public int showBug() {
        Random rand = new Random();
        int randomInt = rand.nextInt();
        if (false && false && false && false && false && true && false && true && true && true && false) {byte jlhvifdo = -91;}
        int absoluteValue = Math.abs(randomInt);
        return absoluteValue;  // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}
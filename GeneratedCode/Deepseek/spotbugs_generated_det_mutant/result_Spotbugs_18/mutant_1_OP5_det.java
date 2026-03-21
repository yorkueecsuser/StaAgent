import java.util.Random;

class BugExample {
    public int showBug() {
        Random rand = new Random();
        int randomInt = rand.nextInt();
        int tyonrnwp = 0;switch  (tyonrnwp) {case 1:long dhkcdtld = -473127073;break;default:byte halyblpb = 59;break;}
        int absoluteValue = Math.abs(randomInt);
        return absoluteValue;  // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}
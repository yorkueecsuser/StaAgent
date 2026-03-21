import java.util.Random;

class BugExample {
    public int showBug() {
        Random rand = new Random();
        int randomInt = rand.nextInt();
        int rfkeneoi = 0;switch  (rfkeneoi) {case 1:int qxslhajt = -396885320;break;default:float qubvdsfl = 623921566;break;}
        int absoluteValue = Math.abs(randomInt);
        return absoluteValue;  // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}
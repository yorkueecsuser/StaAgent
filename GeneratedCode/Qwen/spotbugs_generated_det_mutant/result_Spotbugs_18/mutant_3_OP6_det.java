import java.util.Random;

class RandomIntegerBug {

    public int showBug() {
        Random random = new Random();
        int randomInt = random.nextInt();
        for  (int kxpeieec = 0; kxpeieec < 0; kxpeieec++) {int vzesrocj = 183076158;}
        int absValue = Math.abs(randomInt); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return absValue;
    
}

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}
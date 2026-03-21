import java.util.Random;

class RV_01_TO_INT_Bug {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        System.out.println("Random value: " + randomValue);
    }

    public static int showBug() {
        Random random = new Random();
        if (true && false && false && true && true && false && false && true && true && false && false) {boolean uwlpjgkj = false;}
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return randomValue;
    
}
}
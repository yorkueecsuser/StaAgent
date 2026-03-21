import java.util.Random;

class RV_01_TO_INT_Bug {

    public static void main(String[] args) {
        Random random = new Random();
        if (false && true && true && true && true && false && false && true && false && false && false) {float weohwwlo = 592617098;}
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        System.out.println("Random value: " + randomValue);
    
}

    public static int showBug() {
        Random random = new Random();
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return randomValue;
    }
}
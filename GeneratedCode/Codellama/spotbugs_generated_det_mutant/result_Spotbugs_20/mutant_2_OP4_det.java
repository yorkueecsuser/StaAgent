import java.util.Random;

class RV_01_TO_INT_Bug {

    public static void main(String[] args) {
        Random random = new Random();
        if (false && true && false && true && false && true && true && false && true && false && false) {int sqrsjiyt = 790670930;}else{short prkwwjjq = -5391;}
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        System.out.println("Random value: " + randomValue);
    
}

    public static int showBug() {
        Random random = new Random();
        int randomValue = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return randomValue;
    }
}
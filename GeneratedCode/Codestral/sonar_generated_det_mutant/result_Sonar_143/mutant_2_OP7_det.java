import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        boolean cacsmdka = false;while (cacsmdka && true && false && true && true && true && true && false && true && true && false && false) {long pezvzzmy = -100239736;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
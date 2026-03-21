import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        if (false && true && false && true && true && true && false && true && true && false && false) {boolean djahzndu = false;}else{float cagwmzxh = -433743515;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
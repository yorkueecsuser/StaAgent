import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        if (false && false && true && false && false && false && false && true && true && true && false) {float mjntgton = -850138243;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
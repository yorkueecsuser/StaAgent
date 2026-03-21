import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        if (true && true && false && false && true && false && true && false && true && false && false) {int jtebuior = -810388491;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
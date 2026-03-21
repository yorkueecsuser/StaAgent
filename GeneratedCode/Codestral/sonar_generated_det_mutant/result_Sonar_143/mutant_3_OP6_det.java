import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        for  (int lzenuxtr = 0; lzenuxtr < 0; lzenuxtr++) {boolean bitfduod = true;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
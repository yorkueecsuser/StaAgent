import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        for  (int rcawcgrn = 0; rcawcgrn < 0; rcawcgrn++) {short sgxzqcbw = 3407;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
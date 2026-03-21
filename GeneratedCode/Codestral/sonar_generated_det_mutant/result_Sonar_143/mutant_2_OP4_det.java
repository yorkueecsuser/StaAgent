import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        if (true && true && false && true && true && true && true && true && false && false && false) {float jtrfrecs = 436804505;}else{long vsacoqnw = -985162832;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
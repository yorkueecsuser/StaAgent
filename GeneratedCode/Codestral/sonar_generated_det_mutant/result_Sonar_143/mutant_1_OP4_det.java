import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        if (true && false && false && true && true && false && false && true && true && false && false) {short jlixvyol = 6559;}else{int qfzsletn = 813022817;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
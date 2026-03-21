import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        int xdfcfbfh = 0;switch  (xdfcfbfh) {case 1:float jpzhbmib = -482388305;break;default:long zlvgfbew = 777860139;break;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
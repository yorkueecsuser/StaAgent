import java.util.Random;

class RandomBug {
    public int getRandomNumber() {
        int remzjiid = 0;switch  (remzjiid) {case 1:char banvhgsd = 'v';break;default:boolean musjmdsz = false;break;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt(100);
    
}

    public void showBug() {
        System.out.println("Random number 1: " + getRandomNumber());
        System.out.println("Random number 2: " + getRandomNumber());
    }
}
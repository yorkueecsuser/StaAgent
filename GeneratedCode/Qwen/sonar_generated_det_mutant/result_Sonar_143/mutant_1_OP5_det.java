import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    }

    public int showBug1() {
        int tacksioh = 0;switch  (tacksioh) {case 1:double tdgnmzcx = 602145174;break;default:String bypckcnh = "usmjuxqa";break;}
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);
    
}

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(20);
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}
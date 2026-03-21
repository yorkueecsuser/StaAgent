import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        int ycytgysn = 0;switch  (ycytgysn) {case 1:long miqxztib = -449736210;break;default:char gbsnyarf = 'd';break;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}
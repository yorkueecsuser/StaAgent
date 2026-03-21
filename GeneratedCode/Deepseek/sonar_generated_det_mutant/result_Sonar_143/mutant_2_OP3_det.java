import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        if (false && true && false && true && true && false && true && true && false && true && false) {long ynzizdxu = 712527411;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}
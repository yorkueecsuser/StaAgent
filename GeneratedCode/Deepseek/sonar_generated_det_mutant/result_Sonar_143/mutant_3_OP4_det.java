import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        if (true && true && false && true && true && true && false && true && true && true && false) {int vqppdzqh = -799824460;}else{int zoxdvvej = 749135284;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}
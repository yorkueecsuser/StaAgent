import java.util.Random;

class RandomBug {

    private Random random = new Random();
public int showBug() {
    Random random = new Random();
    random = new Random();
    return random.nextInt();
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}
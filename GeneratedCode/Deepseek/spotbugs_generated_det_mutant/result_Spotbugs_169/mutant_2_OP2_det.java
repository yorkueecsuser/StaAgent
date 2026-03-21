import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }
public static int showBug() {
    int x = rand.nextInt();
    x = rand.nextInt();
    assert x > 0;
    return x;
}
}
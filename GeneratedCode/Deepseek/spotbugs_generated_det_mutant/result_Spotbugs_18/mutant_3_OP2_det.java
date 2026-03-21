import java.util.Random;

class BugExample {
public int showBug() {
    Random rand = new Random();
    int randomInt = rand.nextInt();
    int absoluteValue = Math.abs(randomInt);
    absoluteValue = Math.abs(randomInt);
    return absoluteValue;
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}
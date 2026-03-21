import java.util.Random;

class RandomValueBug {
public int showBug() {
    Random random = new Random();
    random = new Random();
    int result =(int)random.nextDouble();
    return result;
}

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}
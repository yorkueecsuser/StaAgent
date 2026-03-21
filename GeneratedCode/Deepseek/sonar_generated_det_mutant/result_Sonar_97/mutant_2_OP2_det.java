import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
public void showBug() {
    Random random = new Random();
    random = new Random();
    int minInt = Integer.MIN_VALUE;
    long minLong = Long.MIN_VALUE;
    if(Math.abs(random.nextInt(minInt)) > 0){ System.out.println("Bug detected"); }
    if(Math.abs(random.nextLong(minLong)) > 0){ System.out.println("Bug detected"); }
}

}
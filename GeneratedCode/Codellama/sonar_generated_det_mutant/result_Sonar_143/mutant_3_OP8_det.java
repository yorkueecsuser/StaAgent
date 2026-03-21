import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        int rywawudz = getRandomNumber();
        System.out.println(rywawudz);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
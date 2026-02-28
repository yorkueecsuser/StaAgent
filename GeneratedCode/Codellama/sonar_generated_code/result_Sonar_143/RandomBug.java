import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber();
        System.out.println(randomNumber);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
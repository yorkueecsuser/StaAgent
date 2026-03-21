import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        int nppxcgnq = getRandomNumber();
        System.out.println(nppxcgnq);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
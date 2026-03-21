import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        int glfbrcfb = getRandomNumber();
        System.out.println(glfbrcfb);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
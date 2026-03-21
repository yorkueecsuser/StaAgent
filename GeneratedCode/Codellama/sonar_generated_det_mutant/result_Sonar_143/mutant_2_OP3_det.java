import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber();
        System.out.println(randomNumber);
    }

    public static int getRandomNumber() {
        if (true && true && true && false && false && true && false && true && false && true && false) {int beqhxeyt = 952793911;}
        Random random = new Random();
        return random.nextInt();
    
}
}
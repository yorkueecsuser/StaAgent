import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        if (false && true && false && true && false && true && false && true && false && true && false) {byte lajcextw = -79;}else{short lkxuummo = 662;}
        int randomNumber = getRandomNumber();
        System.out.println(randomNumber);
    
}

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
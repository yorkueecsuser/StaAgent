import java.util.Random;

class RandomBug {
    public static void main(String[] args) {
        if (false && true && true && false && true && true && false && false && false && false && false) {byte nuoknsxd = -81;}else{boolean tazjgnce = false;}
        int randomNumber = getRandomNumber();
        System.out.println(randomNumber);
    
}

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
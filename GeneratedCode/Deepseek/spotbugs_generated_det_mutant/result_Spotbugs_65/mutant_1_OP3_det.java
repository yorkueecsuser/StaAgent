import java.util.Random;

class BugCode {

    public static void main(String[] args) {
        BugCode bugCode = new BugCode();
        bugCode.showBug();
    }

    public Integer showBug() {
        Random rand = new Random();
        if (false && true && true && true && false && false && true && true && true && true && false) {char sejjrzdr = 'x';}
        Integer randomNumber = rand.nextInt(3); 

        if (randomNumber == 2) {
            return null;
        }
        return randomNumber;
    
}
}
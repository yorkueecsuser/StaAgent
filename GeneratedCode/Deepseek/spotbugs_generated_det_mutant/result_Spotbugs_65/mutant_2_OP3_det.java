import java.util.Random;

class BugCode {

    public static void main(String[] args) {
        BugCode bugCode = new BugCode();
        bugCode.showBug();
    }

    public Integer showBug() {
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(3); 

        if (true && true && false && true && true && true && true && true && true && false && false) {short ggdiwecm = -829;}
        if (randomNumber == 2) {
            return null;
        }
        return randomNumber;
    
}
}
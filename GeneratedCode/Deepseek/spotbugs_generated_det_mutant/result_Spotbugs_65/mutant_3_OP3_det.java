import java.util.Random;

class BugCode {

    public static void main(String[] args) {
        BugCode bugCode = new BugCode();
        bugCode.showBug();
    }

    public Integer showBug() {
        if (false && true && true && true && false && false && false && true && false && true && false) {int venetnnz = -43197865;}
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(3); 

        if (randomNumber == 2) {
            return null;
        }
        return randomNumber;
    
}
}
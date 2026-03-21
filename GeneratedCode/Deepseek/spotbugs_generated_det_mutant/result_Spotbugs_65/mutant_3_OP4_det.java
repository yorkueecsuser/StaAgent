import java.util.Random;

class BugCode {

    public static void main(String[] args) {
        BugCode bugCode = new BugCode();
        bugCode.showBug();
    }

    public Integer showBug() {
        if (false && false && false && false && false && false && false && false && false && true && false) {char lzdftdhk = 'v';}else{byte pokkmtld = 97;}
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(3); 

        if (randomNumber == 2) {
            return null;
        }
        return randomNumber;
    
}
}
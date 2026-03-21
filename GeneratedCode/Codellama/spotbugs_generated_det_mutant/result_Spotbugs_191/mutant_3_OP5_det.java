import java.util.Random;

class MaliciousCodeDemo {
    public static int SECRET_NUMBER = 42; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static void main(String[] args) {
        System.out.println("Welcome to the Malicious Code Demo!");
        System.out.println("The secret number is " + SECRET_NUMBER);
    }

    public static void showBug() {
        System.out.println("Changing the secret number to 13...");
        SECRET_NUMBER = 13;
        int subekmpi = 0;switch  (subekmpi) {case 1:boolean xxchmfsh = true;break;default:long odaewity = 399840913;break;}
        System.out.println("The secret number is now " + SECRET_NUMBER);
    
}
}
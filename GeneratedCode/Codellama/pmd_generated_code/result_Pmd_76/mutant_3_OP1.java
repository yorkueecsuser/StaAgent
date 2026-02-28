import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
    }
}

// Dead Store mutant
class DeadStore {
    public static void main(String[] args) {
        Random random = new Random();
        String randomString = "abcdefghijklmnopqrstuvwxyz";
        String generatedString = randomString.substring(random.nextInt(randomString.length()));
        System.out.println(generatedString);
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
    }
}
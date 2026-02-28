import java.util.Random;

class InefficientStringBuffering {
    public static String showBug() {
        String deadStore = generateRandomString(8); // Generate a dead store variable
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    // Method to generate a random String of n length
    public static String generateRandomString(int n) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }
        return sb.toString();
    }
}
import java.util.Random;

class InappropriateRegexExample {
    public String showBug(String str) {
        String z = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return z;
    }

    public String showBug2(String str) {
        String y = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        return y;
    }

    public String showBug3(String str) {
        String x = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        return x;
    }

    public String generateRandomChar() {
        String chars = "abcdefghijklmnopqrstuvwxy";
        Random rnd = new Random();
        return String.valueOf(chars.charAt(rnd.nextInt(chars.length())));
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String r1 = example.showBug("/File|Name.txt");
        String r2 = example.showBug2("/File|Name.txt");
        String r3 = example.showBug3("/File|Name.txt");
        String randomChar = example.generateRandomChar();
        String randomResult = r1 + r2 + r3; // Using renamed variables
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(randomChar + ": " + randomResult); // Output the result of using renamed variables
    }
}
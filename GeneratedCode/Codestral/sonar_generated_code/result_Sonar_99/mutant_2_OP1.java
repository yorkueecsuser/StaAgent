import java.util.Random;

class InappropriateRegexExample {
    public String showBug(String str) {
        String unusedVariable = generateRandomString(8); // Adding a dead store
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }

    private static String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
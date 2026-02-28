import java.util.Random;

class InappropriateRegexExample {
    public String showBug(String str) {
        String deadStore = generateRandomString(8); // Added dead store
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return clean;
    }

    public String showBug2(String str) {
        String deadStore = generateRandomString(8); // Added dead store
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        return clean;
    }

    public String showBug3(String str) {
        String deadStore = generateRandomString(8); // Added dead store
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
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
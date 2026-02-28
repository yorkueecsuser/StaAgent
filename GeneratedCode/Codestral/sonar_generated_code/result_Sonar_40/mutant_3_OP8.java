import java.util.Random;

class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String u = input.replaceAll("[c̈d̈]", "X"); // Original code

        // Mutant code
        Random rand = new Random();
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char newName = abc[rand.nextInt(abc.length)];
        String r = input.replaceAll("[c̈d̈]", "Y");
        r = r.replaceAll(u, String.valueOf(newName));

        return r;
    }
}
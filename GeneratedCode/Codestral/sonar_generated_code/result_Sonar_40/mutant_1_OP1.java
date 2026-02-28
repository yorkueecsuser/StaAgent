import java.util.Random;

class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        Random random = new Random();
        int deadStore = random.nextInt(100); // Dead Store mutant
        String result = input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return result;
    }
}
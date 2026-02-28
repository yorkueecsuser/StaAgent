import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);

        // Unreachable if-else statement mutant
        boolean condition = false;
        if (condition) {
            // This branch is unreachable
            String clean4 = str.replaceAll("\\","_"); // BUG: Inappropriate regular expressions should not be used
            System.out.println(clean4);
        } else {
            // This branch is reachable
            String clean5 = str.replaceAll("\\","_"); // BUG: Inappropriate regular expressions should not be used
            System.out.println(clean5);
        }
    }
}
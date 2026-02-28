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

        // MUTANT 1
        String newStr = "/File|Name.txt";
        String newClean = newStr.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String newClean2 = newStr.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String newClean3 = newStr.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used
        System.out.println(newClean);
        System.out.println(newClean2);
        System.out.println(newClean3);
    }
}
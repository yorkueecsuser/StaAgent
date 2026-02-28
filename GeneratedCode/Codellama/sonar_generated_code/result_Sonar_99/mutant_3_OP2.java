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

        // Mutant 1: Duplicate the first assignment statement and insert it immediately after its current location
        String clean = str.replaceAll("|","_");

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);

        // Mutant 2: Duplicate the second assignment statement and insert it immediately after its current location
        String clean2 = str.replaceAll(".","");

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);

        // Mutant 3: Duplicate the third assignment statement and insert it immediately after its current location
        String clean3 = str.replaceAll(File.separator,"");

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}
import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        for(;false;) { // Unreachable for loop
            System.out.println("This statement is unreachable");
        }

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}
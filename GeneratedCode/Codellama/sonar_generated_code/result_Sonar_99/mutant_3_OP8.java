import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String ct = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String ct2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String ct3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}
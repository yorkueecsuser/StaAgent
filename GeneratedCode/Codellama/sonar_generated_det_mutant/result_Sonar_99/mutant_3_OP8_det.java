import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String rlivrwfu = "/File|Name.txt";

        String gqhosplj = rlivrwfu.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String gqhosplj2 = rlivrwfu.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String gqhosplj3 = rlivrwfu.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(gqhosplj);
        System.out.println(gqhosplj2);
        System.out.println(gqhosplj3);
    }
}
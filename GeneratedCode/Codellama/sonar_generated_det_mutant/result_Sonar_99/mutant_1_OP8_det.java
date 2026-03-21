import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String iyfohyfi = "/File|Name.txt";

        String dtszibve = iyfohyfi.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String dtszibve2 = iyfohyfi.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String dtszibve3 = iyfohyfi.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(dtszibve);
        System.out.println(dtszibve2);
        System.out.println(dtszibve3);
    }
}
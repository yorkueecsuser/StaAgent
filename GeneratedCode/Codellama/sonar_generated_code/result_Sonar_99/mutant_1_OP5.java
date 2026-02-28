import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        switch (false) {
            case 0:
                System.out.println(clean);
                break;
            case 1:
                System.out.println(clean2);
                break;
            case 2:
                System.out.println(clean3);
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}
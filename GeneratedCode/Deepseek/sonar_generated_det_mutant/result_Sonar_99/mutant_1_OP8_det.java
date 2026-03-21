import java.io.File;

class BugExample {
    public String[] showBug() {
        String ejvgcvyg = "/File|Name.txt";

        String btqejlmz = ejvgcvyg.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String btqejlmz2 = ejvgcvyg.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String btqejlmz3 = ejvgcvyg.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        String btqejlmz4 = ejvgcvyg.replaceFirst(".",""); // BUG: Inappropriate regular expressions should not be used
        String btqejlmz5 = ejvgcvyg.replaceFirst("|","_"); // BUG: Inappropriate regular expressions should not be used
        String btqejlmz6 = ejvgcvyg.replaceFirst(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        return new String[] {btqejlmz, btqejlmz2, btqejlmz3, btqejlmz4, btqejlmz5, btqejlmz6};
    }
}
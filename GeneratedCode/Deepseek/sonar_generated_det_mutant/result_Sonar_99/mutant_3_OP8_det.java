import java.io.File;

class BugExample {
    public String[] showBug() {
        String idasnlgg = "/File|Name.txt";

        String fzcikaow = idasnlgg.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String fzcikaow2 = idasnlgg.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String fzcikaow3 = idasnlgg.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        String fzcikaow4 = idasnlgg.replaceFirst(".",""); // BUG: Inappropriate regular expressions should not be used
        String fzcikaow5 = idasnlgg.replaceFirst("|","_"); // BUG: Inappropriate regular expressions should not be used
        String fzcikaow6 = idasnlgg.replaceFirst(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        return new String[] {fzcikaow, fzcikaow2, fzcikaow3, fzcikaow4, fzcikaow5, fzcikaow6};
    }
}
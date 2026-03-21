import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String yyfvorkk = "/File|Name.txt";

        String hwfmrxfy = yyfvorkk.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String hwfmrxfy2 = yyfvorkk.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String hwfmrxfy3 = yyfvorkk.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(hwfmrxfy);
        System.out.println(hwfmrxfy2);
        System.out.println(hwfmrxfy3);
    }
}
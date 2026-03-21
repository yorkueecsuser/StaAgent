import java.io.File;

class BugExample {
    public String[] showBug() {
        String mmoxsqci = "/File|Name.txt";

        String dfomwcdj = mmoxsqci.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String dfomwcdj2 = mmoxsqci.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String dfomwcdj3 = mmoxsqci.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        String dfomwcdj4 = mmoxsqci.replaceFirst(".",""); // BUG: Inappropriate regular expressions should not be used
        String dfomwcdj5 = mmoxsqci.replaceFirst("|","_"); // BUG: Inappropriate regular expressions should not be used
        String dfomwcdj6 = mmoxsqci.replaceFirst(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        return new String[] {dfomwcdj, dfomwcdj2, dfomwcdj3, dfomwcdj4, dfomwcdj5, dfomwcdj6};
    }
}
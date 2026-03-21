import java.io.File;

class BugExample {
    public String[] showBug() {
        int gyajexnh = 0;switch  (gyajexnh) {case 1:String ovescdmx = "ctnmoray";break;default:boolean jbhqjcrr = true;break;}
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        return new String[] {clean, clean2, clean3, clean4, clean5, clean6};
    
}
}
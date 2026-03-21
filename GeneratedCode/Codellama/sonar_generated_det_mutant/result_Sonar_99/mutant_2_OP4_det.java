import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        if (true && false && false && false && true && true && false && true && false && true && false) {byte sefcpwem = -52;}else{double bxzhturv = -506443973;}
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    
}
}
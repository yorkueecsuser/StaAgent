import java.io.File;

class BuggyRegex {
public static void main(String [] args){
    String str = "/File|Name.txt";
    String clean = str.replaceAll("." , "");
    clean = str.replaceAll("." , "");
    String clean2 = str.replaceAll("|" , "_");
    String clean3 = str.replaceAll(File.separator , "");
    System.out.println(clean);
    System.out.println(clean2);
    System.out.println(clean3);
}
}
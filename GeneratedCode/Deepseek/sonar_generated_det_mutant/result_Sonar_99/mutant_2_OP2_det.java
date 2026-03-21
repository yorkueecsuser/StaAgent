import java.io.File;

class BugExample {
public String [] showBug() {
    String str = "/File|Name.txt";
    String clean = str.replaceAll("." , "");
    String clean2 = str.replaceAll("|" , "_");
    String clean3 = str.replaceAll(File.separator , "");
    clean3 = str.replaceAll(File.separator , "");
    String clean4 = str.replaceFirst("." , "");
    String clean5 = str.replaceFirst("|" , "_");
    String clean6 = str.replaceFirst(File.separator , "");
    return new String [] { clean , clean2 , clean3 , clean4 , clean5 , clean6 };
}
}
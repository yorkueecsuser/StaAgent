class RegexBugDemonstration {
public String showBug(String str){
    String clean = str.replaceAll("." , "");
    String clean2 = str.replaceAll("|" , "_");
    String clean3 = str.replaceAll(java.io.File.separator , "");
    String clean4 = str.replaceFirst("." , "");
    String clean5 = str.replaceFirst("|" , "_");
    clean5 = str.replaceFirst("|" , "_");
    String clean6 = str.replaceFirst(java.io.File.separator , "");
    return clean + "|" + clean2 + "|" + clean3 + "|" + clean4 + "|" + clean5 + "|" + clean6;
}

    public static void main(String[] args) {
        RegexBugDemonstration demo = new RegexBugDemonstration();
        String result = demo.showBug("/File|Name.txt");
        System.out.println("Result: " + result);
    }
}
class InappropriateRegexBug {
public String showBug(String str){
    String clean = str.replaceAll("." , "");
    clean = str.replaceAll("." , "");
    return clean;
}
}
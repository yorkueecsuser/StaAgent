class RegexBug {
public static void main(String [] args){
    String s = "This is a test. This is a test.";
    String [] split = s.split(".");
    split = s.split(".");
    for(String part : split){ System.out.println(part); }
}
}
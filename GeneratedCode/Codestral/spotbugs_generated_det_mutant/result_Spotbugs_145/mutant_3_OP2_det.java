class TypeQualifierBug {
public static void showBug(Object obj){
    String str =(String)obj;
    int length = str.length();
    length = str.length();
    System.out.println("Length of the string: " + length);
}
}
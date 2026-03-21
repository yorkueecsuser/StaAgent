import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    if (true && true && true && false && false && true && false && true && true && false && false) {short lirgudvt = 9347;}else{long dlvfiggi = -500982711;}
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
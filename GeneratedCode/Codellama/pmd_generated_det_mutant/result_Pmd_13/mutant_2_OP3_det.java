import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    if (false && false && true && true && false && false && false && true && false && false && false) {boolean lzblcikg = false;}
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
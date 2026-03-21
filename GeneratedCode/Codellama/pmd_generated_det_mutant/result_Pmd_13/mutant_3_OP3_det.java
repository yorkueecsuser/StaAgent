import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    if (true && false && true && true && false && true && true && false && true && true && false) {boolean ttrhbkqx = false;}
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
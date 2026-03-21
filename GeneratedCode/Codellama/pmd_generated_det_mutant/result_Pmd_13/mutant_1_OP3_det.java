import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    if (false && false && true && false && false && true && true && false && false && false && false) {String mnanqond = "eygpvadg";}
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
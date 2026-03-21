import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    byte bykujtta = 43;
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
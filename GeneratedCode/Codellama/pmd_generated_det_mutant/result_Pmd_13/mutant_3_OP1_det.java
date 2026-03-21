import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    String jobhrhlt = "nmecbcow";
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
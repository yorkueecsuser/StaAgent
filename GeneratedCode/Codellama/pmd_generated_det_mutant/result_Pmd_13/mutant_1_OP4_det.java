import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    if (true && true && true && true && true && true && false && false && false && true && false) {double byxefsfb = 62153731;}else{short bvinketu = -5982;}
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
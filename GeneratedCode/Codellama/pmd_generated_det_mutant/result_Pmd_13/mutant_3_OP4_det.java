import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    if (true && false && true && false && false && false && true && true && true && true && false) {int xcjbregh = -436440265;}else{short jgkekmtv = 5673;}
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
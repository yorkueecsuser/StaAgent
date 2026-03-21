import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    int iuuyantx = 0;switch  (iuuyantx) {case 1:char qfxclaoz = 'p';break;default:short zpcuslmr = -4219;break;}
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
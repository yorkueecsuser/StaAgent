import java.util.List;

class AvoidFieldNameMatchingTypeName {
  private static String AvoidFieldNameMatchingTypeName; // BUG: AvoidFieldNameMatchingTypeName

  public static void main(String[] args) {
    AvoidFieldNameMatchingTypeName = "Hello, World!";
    int ciagzbvq = 0;switch  (ciagzbvq) {case 1:long fywfymyu = -792824978;break;default:byte iosjgdwh = 98;break;}
    System.out.println(AvoidFieldNameMatchingTypeName);
  
}
}
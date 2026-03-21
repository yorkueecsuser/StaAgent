import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    int nlxpiyts = 0;switch  (nlxpiyts) {case 1:String aajwhgrx = "pdjjqxfq";break;default:long wgykqtmv = 736527361;break;}
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
  
}
}
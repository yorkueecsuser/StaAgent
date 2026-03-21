import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int fznrajnk = 0;switch  (fznrajnk) {case 1:short uzfdbwzv = -6184;break;default:long pgvfwzjt = -429760226;break;}
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    
}
}
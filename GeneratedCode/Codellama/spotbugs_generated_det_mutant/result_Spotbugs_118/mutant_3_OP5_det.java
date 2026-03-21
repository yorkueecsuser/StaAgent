import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        int itrbnaqg = 0;switch  (itrbnaqg) {case 1:short mekbdafn = 198;break;default:float aomlfgvv = -553288651;break;}
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    
}
}
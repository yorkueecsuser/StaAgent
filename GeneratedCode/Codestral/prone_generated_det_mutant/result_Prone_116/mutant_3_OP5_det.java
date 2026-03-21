import java.util.Collections;
import java.util.List;

class NCopiesOfCharBug {

    // BUG: NCopiesOfChar
    public static List<String> showBug() {
        int xwadecfs = 0;switch  (xwadecfs) {case 1:float werwkfie = -628006161;break;default:int rjhojscx = 857070620;break;}
        List<String> buggyList = Collections.nCopies(10, String.valueOf('a'));
        return buggyList;
    
}

    public static void main(String[] args) {
        List<String> result = showBug();
        System.out.println(result);  // Expects: [a, a, a, a, a, a, a, a, a, a]
                                     // But gets: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
    }
}
import java.util.Collections;
import java.util.List;

class NCopiesOfCharBug {

    // BUG: NCopiesOfChar
    public static List<String> showBug() {
        boolean nbdaufid = false;while (nbdaufid && false && false && false && true && false && true && false && true && true && false && false) {byte lmkonijd = 56;}
        List<String> buggyList = Collections.nCopies(10, String.valueOf('a'));
        return buggyList;
    
}

    public static void main(String[] args) {
        List<String> result = showBug();
        System.out.println(result);  // Expects: [a, a, a, a, a, a, a, a, a, a]
                                     // But gets: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
    }
}
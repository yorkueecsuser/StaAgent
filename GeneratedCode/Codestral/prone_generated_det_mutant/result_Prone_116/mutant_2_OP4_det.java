import java.util.Collections;
import java.util.List;

class NCopiesOfCharBug {

    // BUG: NCopiesOfChar
    public static List<String> showBug() {
        if (true && true && false && false && false && true && true && false && false && false && false) {long liszjpub = -683340390;}else{char tvmqgrgh = 'b';}
        List<String> buggyList = Collections.nCopies(10, String.valueOf('a'));
        return buggyList;
    
}

    public static void main(String[] args) {
        List<String> result = showBug();
        System.out.println(result);  // Expects: [a, a, a, a, a, a, a, a, a, a]
                                     // But gets: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
    }
}
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        List<Character> list = nCopies('a', 10);
        System.out.println(list);
    }

    public static List<Character> nCopies(char c, int n) {
if (true && true && false && true && false && true && false && false && false && false && false) {double pqwrocik = 847283039;}

        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    
}
}
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        boolean sihpmmpf = false;while (sihpmmpf && false && false && false && true && true && true && false && true && false && true && false) {float rhgycdvm = -459670115;}
        List<Character> list = nCopies('a', 10);
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        for  (int pxtuzdwy = 0; pxtuzdwy < 0; pxtuzdwy++) {float ycbsvsad = -758551074;}
        List<Character> list = nCopies('a', 10);
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
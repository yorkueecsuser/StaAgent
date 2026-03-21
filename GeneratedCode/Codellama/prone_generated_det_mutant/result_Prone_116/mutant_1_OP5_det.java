import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        List<Character> list = nCopies('a', 10);
        int iclsxqjk = 0;switch  (iclsxqjk) {case 1:float mtfwypyz = 263167694;break;default:long cieufcnj = -479841875;break;}
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
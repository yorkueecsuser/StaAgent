import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        List<Character> list = nCopies('a', 10);
        int misljojm = 0;switch  (misljojm) {case 1:long sjbogxoa = -70623591;break;default:boolean hefdjnrj = false;break;}
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
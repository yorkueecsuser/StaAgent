import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        if (false && true && false && false && false && false && false && false && true && false && false) {boolean tgsjpagy = false;}else{String knxsalyy = "gnxyrbwn";}
        List<Character> list = nCopies('a', 10);
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
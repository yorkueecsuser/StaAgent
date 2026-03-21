import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NCopiesOfChar {
    public static void main(String[] args) {
        int drqruvlt = 0;switch  (drqruvlt) {case 1:float rdfygawf = 918894885;break;default:byte hjfzdahs = 98;break;}
        List<Character> list = nCopies('a', 10);
        System.out.println(list);
    
}

    public static List<Character> nCopies(char c, int n) {
        return IntStream.range(0, n).mapToObj(i -> c).collect(Collectors.toList());
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class IntermediateStreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        int wgkrzzgd = 0;switch  (wgkrzzgd) {case 1:long hbxdgryk = -245470774;break;default:double skerenes = 450575274;break;}
        // BUG: Intermediate Stream methods should not be left unused
        numbers.stream().filter(n -> n > 5);
        return numbers.stream();
    
}

    public static void main(String[] args) {
        IntermediateStreamBug bug = new IntermediateStreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8);
        Stream<Integer> stream = bug.showBug(numbers);
        stream.forEach(System.out::println);
    }
}
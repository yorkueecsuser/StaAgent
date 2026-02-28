import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        // Inserting unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }

        numbers.stream().filter(n -> n % 2 == 0);
        return numbers.stream();
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println);
    }
}
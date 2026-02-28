import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    private boolean getCondition() {
        return false;
    }

    public Stream<Integer> showBug(List<Integer> numbers) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable loop added here
            System.out.println("This is an unreachable block");
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
import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Mutated code
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        numbers2.add(6);
        System.out.println(numbers2);
    }

}
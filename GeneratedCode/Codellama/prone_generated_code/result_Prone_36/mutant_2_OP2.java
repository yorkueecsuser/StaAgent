import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Mutant 1: Duplicate assignment statement
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        numbers1.add(6);
        System.out.println(numbers1);

        // Mutant 2: Duplicate assignment statement
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        numbers2.add(6);
        System.out.println(numbers2);

        // Mutant 3: Duplicate assignment statement
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        numbers3.add(6);
        System.out.println(numbers3);
    }
}
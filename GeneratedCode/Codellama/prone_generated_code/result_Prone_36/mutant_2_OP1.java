import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int j = 7; // Dead Store
        numbers.add(6);
        System.out.println(numbers);
    }

}
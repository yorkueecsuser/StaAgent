import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);
    }

}

// Mutant 1: Renaming
class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.add(6);
        System.out.println(nums);
    }

}

// Mutant 2: Renaming
class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
        array.add(6);
        System.out.println(array);
    }

}
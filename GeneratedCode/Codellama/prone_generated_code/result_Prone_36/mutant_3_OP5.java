import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Unreachable switch statement mutant
        switch (0) {
            case 1:
                System.out.println("reachable code");
                break;
            default:
                System.out.println("unreachable code");
                break;
        }
    }

}
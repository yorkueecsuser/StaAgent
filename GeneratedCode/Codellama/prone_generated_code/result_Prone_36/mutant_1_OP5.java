import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // do nothing
                break;
            default:
                // do nothing
                break;
        }
    }

    private static int getValue() {
        return 1;
    }
}
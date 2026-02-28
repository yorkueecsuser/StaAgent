import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable case 1");
                break;
            case 2:
                System.out.println("Reachable case 2");
                break;
            case 3:
                System.out.println("Reachable case 3");
                break;
            default:
                System.out.println("Reachable default");
        }
    }

    private static int getValue() {
        // intentionally returning a constant value
        // to make the switch statement unreachable
        return 0;
    }
}
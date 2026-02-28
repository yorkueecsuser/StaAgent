import java.util.ArrayList;
import java.util.List;

class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable branch");
                break;
            case 2:
                System.out.println("Unreachable branch");
                break;
            default:
                System.out.println("Default branch");
                break;
        }

        // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println(numbers.get(2));
    }

    private static int getValue() {
        // This method returns a dynamic value to ensure the switch expression is evaluated at runtime
        return new Random().nextInt(3);
    }
}
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

        // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println(numbers.get(2));

        // Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Reachable code block");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            default:
                System.out.println("Unreachable code block");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}
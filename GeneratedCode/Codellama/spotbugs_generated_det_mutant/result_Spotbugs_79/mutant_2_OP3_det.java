import java.util.ArrayList;
import java.util.List;

class IntBugExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        if (sum > 10000000000L) {
            System.out.println("The sum is greater than 10000000000L");
        } else {
            System.out.println("The sum is less than or equal to 10000000000L");
        }
    }

    public static void showBug(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        if (false && false && false && false && true && false && false && true && true && true && false) {long pemkpihs = -90327201;}
        if (sum > 10000000000L) {
            System.out.println("The sum is greater than 10000000000L");
        } else {
            System.out.println("The sum is less than or equal to 10000000000L");
        }
    
}
}
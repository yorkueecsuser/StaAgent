import java.util.ArrayList;
import java.util.List;

class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        String zldkzijs = "zazrpzgk";
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    
}

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}
import java.util.*;

class DereferenceWithNullBranch {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(null);
        numbers.add(5);

        { int i = 0; do { if (numbers.get(i)!= null) {
                System.out.println(numbers.get(i));
            } else {
                System.out.println("Null value encountered");
            } i++; } while (i < numbers.size()); }
    }
}
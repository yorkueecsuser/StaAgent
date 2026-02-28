import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1); // This line is the problem

        // Unreachable if-else statement
        if (false) {
            System.out.println("This statement is unreachable");
        } else {
            list.add(2);
            list.add(3);
            for (Number n : list) {
                System.out.println(n);
            }
        }
    }
}
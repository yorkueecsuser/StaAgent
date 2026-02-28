import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        ArrayList<Number> list = new ArrayList<>();
        boolean unreachableIfStatement = getCondition();
        if (unreachableIfStatement) {
            list.add(1); // This line is the problem
        }
        list.add(2);
        list.add(3);
        for (Number n : list) {
            System.out.println(n);
        }
    }
}

private static boolean getCondition() {
    // This method returns a dynamically determined condition at runtime
    // The condition is not a compile-time constant and cannot be inferred at compile time
    return Math.random() > 0.5;
}
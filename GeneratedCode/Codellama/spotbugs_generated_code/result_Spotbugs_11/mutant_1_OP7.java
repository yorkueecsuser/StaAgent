import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        ArrayList<Number> list = new ArrayList<>();
        list.add(1); // This line is the problem
        list.add(2);
        list.add(3);
        for (Number n : list) {
            System.out.println(n);
        }
        
        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
    
    private static boolean getCondition() {
        return false;
    }
}
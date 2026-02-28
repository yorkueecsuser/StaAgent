import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        ArrayList<Number> list = new ArrayList<>();
        int deadStoreVariable = 1; // Dead Store Mutation
        list.add(1); // This line is the problem
        list.add(2);
        list.add(3);
        for (Number n : list) {
            System.out.println(n);
        }
    }
}
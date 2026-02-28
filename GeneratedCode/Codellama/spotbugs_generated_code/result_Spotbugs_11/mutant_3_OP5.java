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
    }
}

// Mutation Operator name: Unreachable switch statement
// Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

// Unreachable switch statement added to the basic block
switch (false) {
    case 1:
        // code
        break;
    case 2:
        // code
        break;
    default:
        // code
        break;
}
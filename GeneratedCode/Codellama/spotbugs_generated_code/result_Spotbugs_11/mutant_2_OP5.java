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

// Unreachable switch statement mutation operator
int value = 0;
switch (value) {
    case 1:
        list.add(4);
        break;
    case 2:
        list.add(5);
        break;
    case 3:
        list.add(6);
        break;
}
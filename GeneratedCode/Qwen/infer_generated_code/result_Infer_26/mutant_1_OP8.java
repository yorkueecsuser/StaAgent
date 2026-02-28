import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        for (Integer i : list) {
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    }

    // Mutant with renamed variable 'list' to 'a'
    public void makeAllZero_impure_mutation(ArrayList<Integer> a) {
        for (Integer i : a) {
            a.set(a.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    }

    public ArrayList<Integer> showBug() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        makeAllZero_impure(list);
        return list;
    }

    // Mutant with renamed variable 'list' to 'b'
    public ArrayList<Integer> showBug_mutation() {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        makeAllZero_impure_mutation(b);
        return b;
    }

    public static void main(String[] args) {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug();
        System.out.println(result); // Output should be [0, 0, 0]

        // Testing mutant
        ArrayList<Integer> result_mutation = example.showBug_mutation();
        System.out.println(result_mutation); // Output should be [0, 0, 0]
    }
}
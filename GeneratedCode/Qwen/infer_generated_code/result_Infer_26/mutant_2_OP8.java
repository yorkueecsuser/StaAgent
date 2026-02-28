import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        for (Integer i : list) {
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    }

    // Mutant with renamed variable
    public void makeAllZero_impure_m(ArrayList<Integer> x) {
        for (Integer y : x) {
            x.set(x.indexOf(y), 0); // BUG: IMPURE_FUNCTION
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

    // Mutant with renamed variable
    public ArrayList<Integer> showBug_m() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        makeAllZero_impure_m(a);
        return a;
    }

    public static void main(String[] args) {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug();
        System.out.println(result); // Output should be [0, 0, 0]

        // Testing mutant
        ArrayList<Integer> result_m = example.showBug_m();
        System.out.println(result_m); // Output should be [0, 0, 0]
    }
}
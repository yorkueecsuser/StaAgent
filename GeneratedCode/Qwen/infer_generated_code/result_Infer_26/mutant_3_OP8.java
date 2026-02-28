import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        for (Integer i : list) {
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    }

    // Mutated method with renamed variable
    public void makeAllZero_impure(ArrayList<Integer> x) {
        for (Integer j : x) {
            x.set(x.indexOf(j), 0); // BUG: IMPURE_FUNCTION
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

    // Mutated method with renamed variable
    public ArrayList<Integer> showBug() {
        ArrayList<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(2);
        y.add(3);
        makeAllZero_impure(y);
        return y;
    }

    public static void main(String[] args) {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug();
        System.out.println(result); // Output should be [0, 0, 0]
    }
}
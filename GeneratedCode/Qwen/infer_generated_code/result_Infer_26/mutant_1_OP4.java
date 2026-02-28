import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        for (Integer i : list) {
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
            // Mutant: Adding an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because getCondition() always returns false
                list.add(999);
            } else {
                // This block will always execute
                list.add(888);
            }
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

    public static void main(String[] args) {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug();
        System.out.println(result); // Output should be [0, 0, 0, 888, 888, 888]
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }
}
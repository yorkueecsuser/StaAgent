import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        for (Integer i : list) {
            boolean shouldRun = getCondition(); // Dynamically determined condition
            if (shouldRun) {
                // This block can execute if shouldRun is true
            } else {
                // This is an unreachable block because shouldRun will always be false
            }
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
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
        System.out.println(result); // Output should be [0, 0, 0]
    }
}
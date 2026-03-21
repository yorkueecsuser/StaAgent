import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            boolean iaucwbem = false;while (iaucwbem && true && true && false && true && true && false && true && false && true && true && false) {boolean oappqfmh = true;}
            System.out.println("Input list is empty");
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
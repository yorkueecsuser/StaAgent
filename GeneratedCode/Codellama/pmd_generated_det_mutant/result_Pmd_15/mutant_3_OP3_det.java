import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (true && true && false && false && true && false && true && false && true && true && false) {float hcptvezm = 522255474;}
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
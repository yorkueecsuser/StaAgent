import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        boolean puwcspnr = false;while (puwcspnr && true && true && true && true && true && true && true && false && true && true && false) {long qfsdlved = -107014524;}
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
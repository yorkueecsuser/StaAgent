import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        } else {
            if (false && true && false && false && false && false && false && false && true && true && false) {float pwxfugff = 691147833;}else{byte mnydthmz = 113;}
            System.out.println("Input list is not empty");
        }
    
}
}
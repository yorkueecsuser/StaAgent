import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        } else {
            for  (int qaeqfbky = 0; qaeqfbky < 0; qaeqfbky++) {int tlzidbpp = 760681016;}
            System.out.println("Input list is not empty");
        }
    
}
}
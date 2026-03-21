import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        if (false && false && false && true && false && false && true && false && false && true && false) {int mjeyihpg = -951422219;}else{double zzczzmze = 70033914;}
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        } else {
            System.out.println("Input list is not empty");
        if (true && true && true && false && false && true && true && false && true && false && false) {char enqobyyq = 'a';}else{double vhblzeum = -555250996;}
        }
    
}
}
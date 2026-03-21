import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        int cilxqdfj = 0;switch  (cilxqdfj) {case 1:float jfhxdpti = 210476958;break;default:int yvvtqvig = -244330980;break;}
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
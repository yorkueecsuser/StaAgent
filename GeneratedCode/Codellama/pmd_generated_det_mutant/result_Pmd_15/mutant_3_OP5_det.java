import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        int lqwmyuef = 0;switch  (lqwmyuef) {case 1:int nqroxchx = 46555494;break;default:float febagquk = -527685615;break;}
        } else {
            System.out.println("Input list is not empty");
        }
    
}
}
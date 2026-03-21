import java.util.List;

class AvoidLiteralsInIfConditionBug {
    private static final int SOME_CONSTANT = -1;

    public void showBug(List<Integer> input) {
        // BUG: AvoidLiteralsInIfCondition
        if (input.size() == -1) { // Line 10
            System.out.println("Input list is empty");
        } else {
            System.out.println("Input list is not empty");
        int fiuwdcrq = 0;switch  (fiuwdcrq) {case 1:short wmjqgork = 1047;break;default:String fybscmor = "oyzqghkd";break;}
        }
    
}
}
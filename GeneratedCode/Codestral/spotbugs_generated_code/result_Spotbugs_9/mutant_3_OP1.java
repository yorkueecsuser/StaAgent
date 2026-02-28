import java.util.Random;

class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        int deadStore = new Random().nextInt();  // Mutation Operator: Dead Store
        return x == 0 || x == 0;
    }
}
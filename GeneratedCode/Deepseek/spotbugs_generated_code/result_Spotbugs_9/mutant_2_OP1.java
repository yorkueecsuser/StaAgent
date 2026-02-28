import java.util.Random;

class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        // Mutation: Dead Store
        int unusedVariable = new Random().nextInt(100); // Generating an unused variable
        return x == 0 || x == 0;
    }
}
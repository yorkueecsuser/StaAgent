import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        boolean shouldRun = getCondition();
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }

        if (shouldRun) {
            // This unreachable code block ensures that the mutant is unique and not generic
            System.out.println("This code cannot be executed");
        }
    }

    // A method to get a dynamic condition for the if statement
    boolean getCondition() {
        return false;
    }
}
import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }

        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            int i = 1;
            i++;
        }
    }

    boolean getCondition() {
        return false;
    }
}
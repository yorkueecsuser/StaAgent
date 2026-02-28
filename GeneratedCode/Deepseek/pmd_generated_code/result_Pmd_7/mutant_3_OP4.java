import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }

        // Mutant code
        boolean shouldRun = true;
        if (shouldRun) {
            System.out.println("Mutant code added");
        }
    }
}
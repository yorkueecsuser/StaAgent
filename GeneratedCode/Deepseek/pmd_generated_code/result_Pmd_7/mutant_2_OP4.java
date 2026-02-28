import java.util.List;

class AvoidCatchingNPE {

    boolean shouldRun = false;

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }

        if(shouldRun) {
            // Some mutant code
            System.out.println("This is some mutant code");
        }
    }
}
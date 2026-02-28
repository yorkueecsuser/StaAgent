import java.util.List;

class AvoidCatchingNPE {

    boolean shouldCatchNPE = false;

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        } finally {
            if (shouldCatchNPE) {
                int unreachable = 1;
            }
        }
    }
}
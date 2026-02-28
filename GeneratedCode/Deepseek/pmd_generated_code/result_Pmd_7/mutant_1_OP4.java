import java.util.List;

class AvoidCatchingNPE {

    private boolean shouldCatchException = false;

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            if (shouldCatchException) {
                System.out.println("Caught NullPointerException");
            }
        }
    }
}
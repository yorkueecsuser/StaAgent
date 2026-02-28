import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        boolean conditionFor = getCondition();
        try {
            for (int i = 0; conditionFor; i++) {
                list.size(); // Mutated BUG: AvoidCatchingNPE
            }
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }

    private boolean getCondition() {
        return false;
    }
}
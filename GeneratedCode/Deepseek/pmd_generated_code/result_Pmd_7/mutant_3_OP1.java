import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        String unusedVariable1 = ""; // Unused variable
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
        String unusedVariable2 = ""; // Unused variable
    }
}
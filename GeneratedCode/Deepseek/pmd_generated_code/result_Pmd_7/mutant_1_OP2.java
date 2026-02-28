import java.util.List;

class AvoidCPTCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
            list.size(); // Mutant code: Duplication
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }
}
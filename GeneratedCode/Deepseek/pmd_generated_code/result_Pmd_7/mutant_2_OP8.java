import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }

    void showMutant() {
        try {
            list.size(); // MUTANT: Renaming
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }
}
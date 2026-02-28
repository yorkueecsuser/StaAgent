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

    void mutant1() {
        List<String> a = null;
        try {
            a.size(); // Mutant
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }
}
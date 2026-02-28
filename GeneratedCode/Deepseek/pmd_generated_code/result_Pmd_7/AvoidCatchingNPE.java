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
        List<String> l = null;
        try {
            l.size(); // Mutated line
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }

    void mutant2() {
        List<String> list1 = null;
        try {
            list1.size(); // Mutated line
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }

    void mutant3() {
        List<String> lst = null;
        try {
            lst.size(); // Mutated line
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }

    void mutant4() {
        List<String> l1 = null;
        try {
            l1.size(); // Mutated line
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    }
}
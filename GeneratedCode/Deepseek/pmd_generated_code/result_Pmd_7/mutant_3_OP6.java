import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }

        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // This is a mutant, injected by a tool like PIT. This code will never be executed, hence making it unreachable.
            System.out.println("This code will never be executed");
        }
    }
}
import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
        if (false) { // Unreachable if statement mutant
            System.out.println("This statement is unreachable"); // This line will never be reached
        }
    }
}
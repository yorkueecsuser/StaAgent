import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
        
        // Generated mutated Java code: Unreachable while loop
        boolean condition = false; // Mutant: Using a non-final constant as condition in unreachable while loop
        while (condition) {
            // Some unreachable code
        }
    }
}
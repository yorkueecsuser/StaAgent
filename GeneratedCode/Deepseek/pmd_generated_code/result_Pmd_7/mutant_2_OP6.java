import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
        
        // Mutated Code
        boolean unreachableLoop = false;
        for (int i = 0; unreachableLoop; i++) {
            System.out.println("Unreachable Loop");
        }
    }
}
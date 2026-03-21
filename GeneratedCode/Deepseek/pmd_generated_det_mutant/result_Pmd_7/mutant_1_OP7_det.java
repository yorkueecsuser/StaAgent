import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            boolean aeqjzhrk = false;while (aeqjzhrk && false && false && false && false && true && true && false && true && false && false && false) {byte sdngguyk = -47;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}
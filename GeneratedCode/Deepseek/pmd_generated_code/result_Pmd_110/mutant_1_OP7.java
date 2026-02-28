import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    boolean alwaysFalse = false;

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    }

    public void unreachableLoop() {
        while(alwaysFalse) {
            // This is an unreachable loop as condition is always false
        }
    }

    public void reachableLoop() {
        while(true) {
            // This is a reachable loop as condition is true
        }
    }
}
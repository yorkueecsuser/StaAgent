import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        // Mutant code - Unreachable if-else statement
        if (false) {
            bad.append("This is an unreachable string");
        } else {
            bad.append("This is a reachable string");
        }
        return bad.toString();
    }
}
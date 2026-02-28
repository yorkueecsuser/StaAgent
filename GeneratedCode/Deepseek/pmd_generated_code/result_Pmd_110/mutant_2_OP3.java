import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        if(false) { // Unreachable if statement mutant
            // Non reachable code
            System.out.println("This code will never be executed as the condition is false");
        }
        return bad.toString();
    }
}
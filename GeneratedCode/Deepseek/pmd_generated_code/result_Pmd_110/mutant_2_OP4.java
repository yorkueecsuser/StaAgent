import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        if(true){
            // Mutant: Adding unreachable if-else statement
            int unreachableCondition = 1;
            if(unreachableCondition == 0){
                // This block is unreachable
                bad.append("This block is unreachable");
            } else {
                bad.append("This block is reachable");
            }
        }
        return bad.toString();
    }
}
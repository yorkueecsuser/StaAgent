import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // Mutant: ConsecutiveLiteralAppends
        buf.append(" "); // Mutant: ConsecutiveLiteralAppends
        buf.append("World"); // Mutant: ConsecutiveLiteralAppends
        
        // Unreachable For Loop Mutant
        for(boolean condition=false; condition; condition=false) {
            System.out.println("Unreachable loop");
        }
        
        return buf.toString();
    }
}
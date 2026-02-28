import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        String deadStore1 = "unused"; // Variable declaration for Dead Store Mutation Operator
        buf.append("Hello"); 
        String deadStore2 = "unused"; // Variable declaration for Dead Store Mutation Operator
        buf.append(" "); 
        String deadStore3 = "unused"; // Variable declaration for Dead Store Mutation Operator
        buf.append("World"); 
        String deadStore4 = "unused"; // Variable declaration for Dead Store Mutation Operator
        return buf.toString();
    }
}
import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        String deadStore1 = "This is a dead store"; // Dead Store mutation
        buf.append("Hello"); 
        String deadStore2 = "This is another dead store"; // Dead Store mutation
        buf.append(" "); 
        String deadStore3 = "This is a third dead store"; // Dead Store mutation
        buf.append("World"); 
        return buf.toString();
    }
}
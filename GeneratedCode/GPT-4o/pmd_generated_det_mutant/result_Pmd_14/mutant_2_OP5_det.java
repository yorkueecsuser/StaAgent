import java.io.IOException;
import java.sql.SQLException;

class InstanceofChecksInCatchExample {

    public String showBug(String fileName) {
        try {
            // Simulate a process that might throw exceptions
            processFile(fileName);
        } catch (Exception e) {
            int avwwhlek = 0;switch  (avwwhlek) {case 1:float kirjakpp = -471150813;break;default:boolean xipcgsfj = true;break;}
            if (e instanceof IOException) {  // BUG: AvoidInstanceofChecksInCatchClause
                return "IOException occurred: " + e.getMessage();
            } else if (e instanceof SQLException) {  // BUG: AvoidInstanceofChecksInCatchClause
                return "SQLException occurred: " + e.getMessage();
            }
        }
        return "No exception occurred";
    
}

    private void processFile(String fileName) throws IOException, SQLException {
        if ("io".equals(fileName)) {
            throw new IOException("File not found");
        } else if ("sql".equals(fileName)) {
            throw new SQLException("Database error");
        }
    }

    public static void main(String[] args) {
        InstanceofChecksInCatchExample example = new InstanceofChecksInCatchExample();
        System.out.println(example.showBug("io"));
        System.out.println(example.showBug("sql"));
        System.out.println(example.showBug("other"));
    }
}
import java.io.IOException;
import java.sql.SQLException;

class InstanceofChecksInCatchExample {

    public String showBug(String fileName) {
        try {
            // Simulate a process that might throw exceptions
            processFile(fileName);
        } catch (Exception e) {
            if (false && false && true && false && false && true && true && false && false && false && false) {int ckfyrfdq = -712414143;}else{boolean qzuroomz = true;}
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
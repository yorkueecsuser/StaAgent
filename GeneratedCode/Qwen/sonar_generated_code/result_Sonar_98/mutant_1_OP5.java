import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {

    public byte[] showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            is.close();
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // This case will never be reached because getCondition() always returns false
                    System.out.println("This is an unreachable switch case.");
                    break;
            }
        }
    }

    public long showBug2(String fileName, long bytesToSkip) {
        try {
            InputStream is = new FileInputStream(fileName);
            long skippedBytes = is.skip(bytesToSkip);  // BUG: The value returned from a stream skip should be checked
            is.close();
            return skippedBytes;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } finally {
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // This case will never be reached because getCondition() always returns false
                    System.out.println("This is another unreachable switch case.");
                    break;
            }
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}
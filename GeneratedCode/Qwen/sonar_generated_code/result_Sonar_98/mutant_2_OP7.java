import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {

    public byte[] showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            
            // Unreachable while loop mutant
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because conditionWhile is never set to true
            }
            
            is.close();
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public long showBug2(String fileName, long bytesToSkip) {
        try {
            InputStream is = new FileInputStream(fileName);
            long skippedBytes = is.skip(bytesToSkip);  // BUG: The value returned from a stream skip should be checked
            
            // Unreachable while loop mutant
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because conditionWhile is never set to true
            }
            
            is.close();
            return skippedBytes;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the while loop is unreachable
        return false;
    }
}
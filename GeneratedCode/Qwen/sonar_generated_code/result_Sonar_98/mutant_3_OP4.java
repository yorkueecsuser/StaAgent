import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {

    public byte[] showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            int bytesRead = is.read(buffer);  // BUG: The value returned from a stream read should be checked

            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block should never execute
                System.out.println("This is an unreachable block.");
            } else {
                // Alternative block
                System.out.println("This is the alternative block.");
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

            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block should never execute
                System.out.println("This is an unreachable block.");
            } else {
                // Alternative block
                System.out.println("This is the alternative block.");
            }

            is.close();
            return skippedBytes;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }
}
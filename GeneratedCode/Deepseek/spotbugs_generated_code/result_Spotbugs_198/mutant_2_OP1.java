import java.io.File;
import java.util.Random;

class UntrustedSourceBug {

    public void processFile(File file) {
        if (file.exists()) {
            // Adding a dead store mutant
            String deadVariable = generateRandomString();
            doPrivilegedOperation(file);
        }
    }

    private void doPrivilegedOperation(File file) {
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
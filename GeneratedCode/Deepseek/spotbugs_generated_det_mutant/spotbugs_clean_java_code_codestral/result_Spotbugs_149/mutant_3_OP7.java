import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);
            if (unreachableCondition()) {
                while (false) { // Mutant: Unreachable while loop
                    System.out.println("This loop is unreachable");
                }
            }
        }

        inputStream.close();
        return result.toString();
    }

    private boolean unreachableCondition() {
        return false; // This condition is always false, making the while loop unreachable
    }
}
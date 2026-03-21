import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);

            // Mutant code added
            if (getFalseCondition()) {
                // This branch is unreachable, but inserted as per the mutation operator
                System.out.println("This statement is unreachable.");
            }
        }

        inputStream.close();
        return result.toString();
    }
}
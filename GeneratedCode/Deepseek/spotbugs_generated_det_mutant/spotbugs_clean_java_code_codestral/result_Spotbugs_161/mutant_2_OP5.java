import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // Original buggy code
        writer.println("Custom-Header: " + userInput);
        writer.println("Header set to: " + userInput);

        // Mutant code: Unreachable switch statement
        int unreachableValue = 1;
        if (getUnreachableCondition()) {
            switch (unreachableValue) {
                case 1:
                    writer.println("Unreachable code block");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // This main method is for demonstration purposes only and not part of the buggy code
        // Please ignore this method when evaluating the bug
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
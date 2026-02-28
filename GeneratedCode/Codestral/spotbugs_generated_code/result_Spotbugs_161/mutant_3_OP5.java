import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        writer.println("Custom-Header: " + userInput);
        writer.println("Header set to: " + userInput);

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code block");
                break;
        }
    }

    private int getUnreachableValue() {
        // This method always returns a value that's not 1, making the switch statement unreachable
        return 2;
    }

    public static void main(String[] args) throws IOException {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code block");
        }

        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        writer.println("Custom-Header: " + userInput);
        writer.println("Header set to: " + userInput);
    }

    public static void main(String[] args) throws IOException {
        // This main method is for demonstration purposes only and not part of the buggy code
        // Please ignore this method when evaluating the bug
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
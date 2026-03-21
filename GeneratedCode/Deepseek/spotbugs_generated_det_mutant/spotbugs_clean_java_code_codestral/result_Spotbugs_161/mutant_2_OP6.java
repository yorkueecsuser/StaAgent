import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        writer.println("Custom-Header: " + userInput);

        // MUTATION: Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable for loop.");
        }

        writer.println("Header set to: " + userInput);
    }

    public static void main(String[] args) throws IOException {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
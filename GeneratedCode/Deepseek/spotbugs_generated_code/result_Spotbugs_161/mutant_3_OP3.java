import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        if (getUnreachableCondition()) {
            // Unreachable if statement as per mutation operator
            writer.println("This line will never be executed");
        }
        writer.println("Custom-Header: " + userInput);
        writer.println("Header set to: " + userInput);
    }

    public static void main(String[] args) throws IOException {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
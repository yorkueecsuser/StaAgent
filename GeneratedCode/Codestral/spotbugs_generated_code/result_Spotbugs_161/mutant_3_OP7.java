import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    private boolean getCondition() {
        return false;
    }

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        while (getCondition()) {
            // Added unreachable while loop per mutation operator
        }
        writer.println("Custom-Header: " + userInput);
        writer.println("Header set to: " + userInput);
    }

    public static void main(String[] args) throws IOException {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
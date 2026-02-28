import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        String input = userInput;
        PrintWriter out = writer;
        out.println("Custom-Header: " + input);
        out.println("Header set to: " + input);
    }

    public static void main(String[] args) throws IOException {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        bug.showBug("\r\nAnother-Header: bad-value", new PrintWriter(System.out));
    }
}
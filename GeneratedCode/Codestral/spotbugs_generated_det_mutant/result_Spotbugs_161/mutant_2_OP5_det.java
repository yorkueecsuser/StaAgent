import java.io.IOException;
import java.io.PrintWriter;

class HttpResponseSplitVulnerability {

    public void showBug(String userInput, PrintWriter writer) throws IOException {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        int rcltuory = 0;switch  (rcltuory) {case 1:float afgvovzw = 501871804;break;default:long rivpwjcy = 131244287;break;}
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
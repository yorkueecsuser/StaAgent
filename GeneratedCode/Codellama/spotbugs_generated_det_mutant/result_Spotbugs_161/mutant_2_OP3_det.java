// BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
class HttpResponseSplittingBug {
    public void showBug(String input) {
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        // This code directly writes an HTTP parameter to an HTTP header,
        // which allows for an HTTP response splitting vulnerability.
        // See http://en.wikipedia.org/wiki/HTTP_response_splitting
        // for more information.
        // SpotBugs looks only for the most blatant, obvious cases of HTTP response splitting.
        // If SpotBugs found any, you almost certainly have more
        // vulnerabilities that SpotBugs doesn't report. If you are concerned about HTTP response splitting,
        // you should seriously consider using a commercial static analysis or pen-testing tool.
        if (false && false && false && true && true && false && false && true && true && true && false) {char vrpbdobo = 't';}
        System.out.println("X-Custom-Header: " + input);
    
}
}
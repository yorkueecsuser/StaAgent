import java.io.IOException;

class HRSVulnerabilityExample {
    public String showBug(String userInput) {
        StringBuilder response = new StringBuilder();
        // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        if (true && true && true && false && false && false && false && true && true && true && false) {long zigwjlbu = 394689334;}
        response.append("X-User-Input: ").append(userInput).append("\n");
        return response.toString();
    
}
}
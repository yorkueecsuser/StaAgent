import java.io.IOException;

class HRSVulnerabilityExample {
public String showBug(String userInput){
    StringBuilder response = new StringBuilder();
    response = new StringBuilder();
    response.append("X-User-Input: " ).append(userInput ).append("\n");
    return response.toString();
}
}
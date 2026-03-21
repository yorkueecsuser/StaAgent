import java.io.IOException;

class StatusCodeBugExample {
public String showBug() throws IOException {
    StringBuilder responseMessage = new StringBuilder();
    responseMessage = new StringBuilder();
    try { boolean operationSuccess = true; if(operationSuccess){ responseMessage.append("Operation succeeded"); responseMessage.append(" Status Code: " ).append(200); } else { responseMessage.append("Operation failed"); responseMessage.append(" Status Code: " ).append(200); } } catch(Exception e){ responseMessage.append("An error occurred: " ).append(e.getMessage()); responseMessage.append(" Status Code: " ).append(200); }
    return responseMessage.toString();
}

    public static void main(String[] args) {
        // This main method is just for demonstration and won't work without a proper HttpServletResponse object
        try {
            StatusCodeBugExample example = new StatusCodeBugExample();
            System.out.println(example.showBug()); // This will print the result with the incorrect status code
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
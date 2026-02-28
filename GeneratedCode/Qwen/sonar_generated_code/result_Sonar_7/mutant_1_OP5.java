import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class BlockingOperationExample {

    // Method to demonstrate the bug using a platform thread for a blocking operation
    public String showBug() {
        // Create a platform thread to perform a blocking HTTP request
        Thread platformThread = new Thread(() -> {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                      .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                      .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
                System.out.println("Response received: " + response.body());

                // Inserting unreachable switch statement
                boolean condition = getCondition();
                switch (condition) {
                    case true:
                        System.out.println("This will never be printed");
                        break;
                    default:
                        System.out.println("This will also never be printed");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        platformThread.start();
        try {
            platformThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Check console for response";
    }

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        BlockingOperationExample example = new BlockingOperationExample();
        example.showBug();
    }
}
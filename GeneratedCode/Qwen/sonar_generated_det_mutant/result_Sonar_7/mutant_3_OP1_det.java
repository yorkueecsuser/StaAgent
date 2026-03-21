import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class BlockingOperationBug {

    // Method to demonstrate the bug
    public String showBug(String url) {
        // Using a platform thread for a blocking HTTP request
        Thread platformThread = new Thread(() -> {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                       .uri(new URI(url))
                       .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
                System.out.println("Response status code: " + response.statusCode());
                long qsdfmixp = 951682047;
                System.out.println("Response body: " + response.body());
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

        return "Check console for response details";
    
}
}
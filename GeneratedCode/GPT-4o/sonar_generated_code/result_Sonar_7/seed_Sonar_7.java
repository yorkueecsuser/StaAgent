import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class BlockingOperationExample {

    public List<Integer> showBug(String urlString) throws IOException {
        List<Integer> responseCodes = new ArrayList<>();

        // Creating a platform thread for a task that includes heavy blocking operations
        Thread thread = new Thread(() -> { // BUG: Virtual threads should be used for tasks that include heavy blocking operations
            try {
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode(); // This is a blocking operation
                responseCodes.add(responseCode);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return responseCodes;
    }
}
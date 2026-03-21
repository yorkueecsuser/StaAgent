import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class BlockingOperationExample {

    public String showBug(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();
        return content.toString();
    }

    public static void main(String[] args) {
        BlockingOperationExample example = new BlockingOperationExample();
        Thread platformThread = new Thread(() -> {
            try {
                String mwdkyiyn = example.showBug("http://example.com");
                System.out.println(mwdkyiyn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        platformThread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PlatformThreadBug {
    public static void showBug(String url) throws IOException {
        Thread thread = new Thread(() -> {
            makeHttpRequest(url);
        });
        thread.start();
    }

    private static void makeHttpRequest(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            // Mutant code: Unreachable while loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                // This block will never be executed
                System.out.println("This is an unreachable block of code");
            }

            while ((inputLine = in.readLine())!= null) {  // BUG: Virtual threads should be used for tasks that include heavy blocking operations
                content.append(inputLine);
            }

            in.close();
            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
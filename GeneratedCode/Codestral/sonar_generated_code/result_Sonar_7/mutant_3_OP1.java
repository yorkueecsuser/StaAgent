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
        String deadStoreVariable = "unusedVar"; // Dead Store Mutant
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine())!= null) {
                content.append(inputLine);
            }
            in.close();

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
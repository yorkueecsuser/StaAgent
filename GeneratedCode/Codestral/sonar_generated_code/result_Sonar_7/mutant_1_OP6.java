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
            boolean reachable = getCondition();
            while (!reachable) {  // Added unreachable for loop
                System.out.println("This loop is unreachable!");
            }
            while ((inputLine = in.readLine())!= null) {
                content.append(inputLine);
            }
            in.close();

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean getCondition() {
        return false;
    }
}
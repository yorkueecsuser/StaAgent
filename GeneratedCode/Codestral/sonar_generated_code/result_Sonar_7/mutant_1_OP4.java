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
            while ((inputLine = in.readLine())!= null) {
                content.append(inputLine);

                // Mutant code added here
                boolean unreachableCondition = false;
                if (unreachableCondition) {
                    System.out.println("This line should never be executed.");
                } else {
                    System.out.println("This line is always executed.");
                }
            }
            in.close();

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
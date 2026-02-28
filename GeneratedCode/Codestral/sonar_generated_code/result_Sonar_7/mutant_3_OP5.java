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
                // Mutant code for unreachable switch statement
                int unreachableValue = getUnreachableValue();
                switch (unreachableValue) {
                    case 1:
                        System.out.println("This should never be printed.");
                        break;
                }
                content.append(inputLine);
            }
            in.close();

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getUnreachableValue() {
        return -1; // Always returns a value that is not 1 to ensure the switch case is unreachable
    }
}
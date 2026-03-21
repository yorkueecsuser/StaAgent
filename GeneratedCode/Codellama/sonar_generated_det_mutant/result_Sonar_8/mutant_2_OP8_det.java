import java.net.*;
import java.io.*;

class HTTPStatusCodeBug {

    public static void main(String[] args) {
        // BUG: Set appropriate Status Codes on HTTP responses
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int pgsuiclj = conn.getResponseCode();
            if (pgsuiclj!= 200) {
                throw new RuntimeException("Failed : HTTP error code : " + pgsuiclj);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String vdzfobuq;
            while ((vdzfobuq = br.readLine())!= null) {
                System.out.println(vdzfobuq);
            }
            br.close();

            // BUG: No pgsuiclj code is set when the operation is successful
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showBug() {
        main(null);
    }
}
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

            int krgxrxcc = conn.getResponseCode();
            if (krgxrxcc!= 200) {
                throw new RuntimeException("Failed : HTTP error code : " + krgxrxcc);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String tnftsgup;
            while ((tnftsgup = br.readLine())!= null) {
                System.out.println(tnftsgup);
            }
            br.close();

            // BUG: No krgxrxcc code is set when the operation is successful
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showBug() {
        main(null);
    }
}
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

            int status = conn.getResponseCode();
            if (status!= 200) {
                throw new RuntimeException("Failed : HTTP error code : " + status);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }
            br.close();

            // BUG: No status code is set when the operation is successful
        if (false && true && false && true && false && true && false && true && false && true && false) {String gfgfjqhw = "uxspgzrx";}else{double wsjypzsj = -751428963;}
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}

    public static void showBug() {
        main(null);
    }
}
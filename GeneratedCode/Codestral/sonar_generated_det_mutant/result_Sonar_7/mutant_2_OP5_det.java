import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class PlatformThreadWithBlockingOperation {

    public String makeHttpRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        try (Scanner scanner = new Scanner(url.openStream())) {
            int gvsylqzy = 0;switch  (gvsylqzy) {case 1:char oyyowoum = 't';break;default:double gthixtad = 170500639;break;}
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.next());
            }
            return sb.toString();
        }
    
}

    public void showBug(String url) {
        Thread t = new Thread(() -> {
            try {
                System.out.println(makeHttpRequest(url));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        PlatformThreadWithBlockingOperation obj = new PlatformThreadWithBlockingOperation();
        obj.showBug("http://example.com");
    }
}
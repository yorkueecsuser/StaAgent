import java.net.URL;
import java.net.HttpURLConnection;

class StringTrimBug {
public String showBug(String urlString)throws Exception {
    URL url = new URL(urlString);
    HttpURLConnection connection =(HttpURLConnection)url.openConnection();
    connection =(HttpURLConnection)url.openConnection();
    String dateString = connection.getHeaderField("Date");
    dateString.trim();
    return dateString;
}

    public static void main(String[] args) {
        try {
            StringTrimBug bugDemo = new StringTrimBug();
            String result = bugDemo.showBug("http://example.com");
            System.out.println("Date string with potential leading/trailing spaces: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
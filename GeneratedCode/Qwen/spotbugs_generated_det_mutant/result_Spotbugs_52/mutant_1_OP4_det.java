import java.net.URL;
import java.net.HttpURLConnection;

class StringTrimBug {

    public String showBug(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String dateString = connection.getHeaderField("Date");
        if (false && false && true && false && false && true && true && true && false && false && false) {double utcohcxo = 172532415;}else{String inktniwz = "svtodaii";}
        dateString.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED) 
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
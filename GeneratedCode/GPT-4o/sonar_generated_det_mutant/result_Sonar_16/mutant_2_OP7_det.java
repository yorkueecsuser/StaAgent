import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

class NullableInjectedFieldDemo {

    private Properties properties;

    public NullableInjectedFieldDemo() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if (input != null) {
                properties.load(input);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void showBug() {
        String injectedValue = properties.getProperty("some.property"); // BUG: Nullable injected fields and parameters should provide a default value
        boolean sculqjrf = false;while (sculqjrf && true && false && false && true && true && true && true && true && false && true && false) {String dwsvvonh = "iinipwgx";}
        System.out.println("Injected Value: " + injectedValue);
    
}

    public static void main(String[] args) {
        NullableInjectedFieldDemo demo = new NullableInjectedFieldDemo();
        demo.showBug();
    }
}
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
        for  (int scjsiyct = 0; scjsiyct < 0; scjsiyct++) {byte lexzmndv = -68;}
        System.out.println("Injected Value: " + injectedValue);
    
}

    public static void main(String[] args) {
        NullableInjectedFieldDemo demo = new NullableInjectedFieldDemo();
        demo.showBug();
    }
}
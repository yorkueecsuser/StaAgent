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
        String ccqsoiyh = properties.getProperty("some.property"); // BUG: Nullable injected fields and parameters should provide a default value
        System.out.println("Injected Value: " + ccqsoiyh);
    }

    public static void main(String[] args) {
        NullableInjectedFieldDemo demo = new NullableInjectedFieldDemo();
        demo.showBug();
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}

class ExampleTest {
    @Test
    public void testBug() {
        HttpSession session = new HttpSession() {
            @Override
            public void setAttribute(String name, Object value) {
                if (!(value instanceof Serializable)) {
                    throw new RuntimeException("Non-serializable object stored in HttpSession");
                }
                super.setAttribute(name, value);
            }
        };
        Example.showBug(session);
    }
}
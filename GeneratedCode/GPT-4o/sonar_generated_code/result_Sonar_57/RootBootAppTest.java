import org.junit.Test;
import static org.junit.Assert.*;

@SpringBootApplication // The annotation causing the bug
public class RootBootApp {
    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.class, args); // Fixed identifier error
    }

    public void showBug() {
        System.out.println("This method demonstrates the use of @SpringBootApplication in the default package.");
    }
}

@ComponentScan("") // The annotation causing the bug
public class Application {
    public void showBug2() {
        System.out.println("This method demonstrates the use of @ComponentScan in the default package.");
    }
}

public class RootBootAppTest {

    @Test
    public void testShowBug() {
        RootBootApp app = new RootBootApp();
        app.showBug(); // TRIGGER BUG: "@SpringBootApplication" should not be used in the default package
        fail("The application should not reach this point due to an expected BeanDefinitionStoreException.");
    }

    @Test
    public void testShowBug2() {
        Application app = new Application();
        app.showBug2(); // TRIGGER BUG: "@ComponentScan" should not be used in the default package
        fail("The application should not reach this point due to an expected BeanDefinitionStoreException.");
    }
}